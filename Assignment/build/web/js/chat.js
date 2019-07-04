'use strict';
const RELOAD_TIME = 2000;
const NUM_OLD_MES_ET = 10;

let messageForm = document.querySelector('#messageForm');
let messageInput = document.querySelector('#message');
let searchInput = document.querySelector('#search_input');
let messageArea = $(".messages")[0];

let sSocket = null;
let oSocket = null;
let nSocket = null;

let uid = getCookie("uid");
let userB = -1;
let fid = -1
let avatar = $("#profile-img").attr("src");

let fid_usr_list = null;
let initialized_chat = {};

function getCookie(name) {
    let re = new RegExp(name + "=([^;]+)");
    let value = re.exec(document.cookie);
    return (value != null) ? unescape(value[1]) : null;
}

function config(list) {
    fid_usr_list= list;
    getMessage();
    messageArea.addEventListener("scroll",scrollCheck);
}
//RE_CONFIG CHAT BOX
function reconfigChat(f) {
    if(initialized_chat[f]==null) {
        initialized_chat[f] = 0;
        getOldMessage(f);
    }
    fid = f;
    userB = fid_usr_list[f][0];
    console.log(userB);
}

//GET OLD MESSAGE
function getOldMessage(fid) {
    oSocket = new WebSocket("ws://localhost:8080/Assignment/getOldMessage");
    let getRequest = {
        'fid': fid,
        'i': initialized_chat[fid],
        'n' : NUM_OLD_MES_ET,
    };
    oSocket.onopen = function () {
        oSocket.send(JSON.stringify(getRequest));
    }
    oSocket.onmessage = function (evt) {
        console.log("Conversation size: "+evt.data);
        let list = JSON.parse(evt.data);
        let gap2end = messageArea.scrollHeight - messageArea.scrollTop;
        list.forEach(function(i){
            console.log(i);
            i['isOld'] = true;
            i['avatar'] = (i.from==uid) ? avatar:fid_usr_list[i.fid][1];
            i['type'] = (i.from==uid) ? 'sent':'replies';
            updateMessage(i);
        });
        messageArea.scrollTop =  messageArea.scrollHeight - gap2end;
        initialized_chat[fid]++;
        oSocket.close();
    }
}

//GET NEW MESSAGE FOR ALL
function getMessage(){
    console.log("Getting:::");
    nSocket = new WebSocket("ws://localhost:8080/Assignment/getNewMessage");
    let getRequest = {
        'uid': uid,
    };
    nSocket.onopen = function () {
        nSocket.send(JSON.stringify(getRequest));
    }
    nSocket.onmessage = function (evt) {
        console.log("RESULT: "+evt.data);
        let hash = JSON.parse(evt.data)
        if(hash!=null) {
            Object.keys(hash).forEach(function (key) {
                hash[key].forEach(function(data) {
                    let message = {
                        fid: key,
                        type: 'replies',
                        avatar: fid_usr_list[key][1],
                        content: data,
                    };
                    updateMessage(message);
                    updateContactMessage(message);
                })
            });
        }
        nSocket.close();
    }
    setTimeout(getMessage, RELOAD_TIME);
}

function sendMessage(evt) {
    console.log("INFO: "+fid+"XX");
    evt.preventDefault();
    let messageContent = messageInput.value.trim();

    if(messageContent) {
        let message = {
            fid: fid,
            from: uid,
            content: messageInput.value,
        };
        sSocket = new WebSocket("ws://localhost:8080/Assignment/sendMessage");
        sSocket.onopen = function () {
            sSocket.send(JSON.stringify(message));
            sSocket.close()
            message['on']=userB
            message['type']='sent';
            message['avatar']=avatar;
            updateMessage(message);
            updateContactMessage(message);
            messageInput.value = '';
            sSocket.close();
        }
    }
}

function updateMessage(message){
    let messageElement = document.createElement('li');
    messageElement.classList.add(message.type);

    let avatarElement = document.createElement('img');
    avatarElement.setAttribute("src",message.avatar);

    messageElement.appendChild(avatarElement);

    let textElement = document.createElement('p');

    let messageText = document.createTextNode(message.content);

    textElement.appendChild(messageText);
    messageElement.appendChild(textElement);

    if(message.isOld==true) {
        $(messageArea).find("#chat-box-" + message.fid).prepend(messageElement);
    }else {
        $(messageArea).find("#chat-box-" + message.fid).append(messageElement);
        messageArea.scrollTop = messageArea.scrollHeight;
    }
}

function updateContactMessage(message) {
    if(message.type=="replies")
        $("#ct_last_"+message.fid).addClass('unread').removeClass('read');
    $("#ct_last_"+message.fid).text(((message.type=="sent") ? 'You: ' : '')+message.content);
}
function scrollCheck() {
    if(messageArea.scrollTop==0){
        getOldMessage(curChatActive);
    }
}

//Contact Filter On Search
function filterContact(){
    let s = searchInput.value.toLowerCase();
    $('.contact').each(function() {
        ($(this).find(".name").text().toLowerCase().includes(s)) ? $(this).show():$(this).hide();
    });
}

messageForm.addEventListener('submit', sendMessage, true);
searchInput.addEventListener('input', filterContact, true);