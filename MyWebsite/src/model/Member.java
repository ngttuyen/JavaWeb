package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
	private int MemberID;
	private String Username,Password,Email,FullName,Address,Phone;
	private boolean Gender;
	private Date dob;
	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

	public Member(int memberID, String username, String password, String email, String fullName, String address,
			String phone, boolean gender, Date dob) {
		super();
		MemberID = memberID;
		Username = username;
		Password = password;
		Email = email;
		FullName = fullName;
		Address = address;
		Phone = phone;
		Gender = gender;
		this.dob = dob;
	}
	
	

	public Member(String memID, String uname, String pword, String mail, String Name, String add,
			String mobile, String gd, String DOB) {
		MemberID = Integer.parseInt(memID);
		Username = uname;
		Password = pword;
		Email = mail;
		FullName = Name;
		Address = add;
		Phone = mobile;
		Gender = gd.equalsIgnoreCase("Male");
		try {
			dob = sdf.parse(DOB);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}



	public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}

	public String getDob() {
		return sdf.format(dob);
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
