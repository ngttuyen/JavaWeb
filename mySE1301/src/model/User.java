package model;

public class User {

	public String userID,fullName,email,password,status;
	public int userRight;

	public User() {
		super();
	}
	public User(String userID, String fullName, String email, String password, String status, int userRight) {
		super();
		this.userID = userID;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.status = status;
		this.userRight = userRight;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUserRight() {
		return userRight;
	}
	public void setUserRight(int userRight) {
		this.userRight = userRight;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", status=" + status + ", userRight=" + userRight + "]";
	}

}
