package model;

public class Users {
	private int UserID,Age,UserRight;
	private String UserName,Password,FullName,Gender,Email,WID,Status,Avatar;
	
	public Users(int userID, int age, int userRight, String userName, String password, String fullName, String gender,
			String email, String wID, String status, String avatar) {
		super();
		UserID = userID;
		Age = age;
		UserRight = userRight;
		UserName = userName;
		Password = password;
		FullName = fullName;
		Gender = gender;
		Email = email;
		WID = wID;
		Status = status;
		Avatar = avatar;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getUserRight() {
		return UserRight;
	}

	public void setUserRight(int userRight) {
		UserRight = userRight;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getWID() {
		return WID;
	}

	public void setWID(String wID) {
		WID = wID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
	}
	
	
	
}
