package model;

public class User {
	public static String userID,fullName,email,password,status;
	public static int userRight;


	public User() {
		super();
	}


	public User(String userID, String fullName, String email, String status, int userRight) {
		super();
		User.userID = userID;
		User.fullName = fullName;
		User.email = email;
		User.status = status;
		User.userRight = userRight;
	}


	public User(String userID, String fullName, String email, String password, String status, int userRight) {
		super();
		User.userID = userID;
		User.fullName = fullName;
		User.email = email;
		User.password = password;
		User.status = status;
		User.userRight = userRight;
	}


	public static String getUserID() {
		return userID;
	}


	public static void setUserID(String userID) {
		User.userID = userID;
	}


	public static String getFullName() {
		return fullName;
	}


	public static void setFullName(String fullName) {
		User.fullName = fullName;
	}


	public static String getEmail() {
		return email;
	}


	public static void setEmail(String email) {
		User.email = email;
	}


	public static String getPassword() {
		return password;
	}


	public static void setPassword(String password) {
		User.password = password;
	}


	public static String getStatus() {
		return status;
	}


	public static void setStatus(String status) {
		User.status = status;
	}


	public static int getUserRight() {
		return userRight;
	}


	public static void setUserRight(int userRight) {
		User.userRight = userRight;
	}




}
