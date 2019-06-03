package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	static SimpleDateFormat sdf;
	private int id;
	private String name;
	private boolean gender;
	private Date dob;
	
	

	public Student() {
		super();
	}


	public Student(int id,String name, boolean gender, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;

	}


	public Student(String Id,String Name,boolean Gender,String DOB) {
		id = Integer.parseInt(Id);
		name = Name;
		gender= Gender;
		sdf = new SimpleDateFormat("dd/MM/yyy");
		try {
			dob=sdf.parse(DOB);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getDob() {
		return sdf.format(dob);
	}

	// hay la thu sai cai simpledateformat ben DAO thu xem :v
	public void setDob(Date dob) {
		this.dob = dob;
	}
}