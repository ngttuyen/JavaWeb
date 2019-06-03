package model;

import java.util.ArrayList;

public class StudentList{
	private static ArrayList<Student> st;
	public StudentList() {
		st = new ArrayList<Student>();
		st.add(new Student("1", "Duong", "Male", "1/1/1999"));
		st.add(new Student("2", "Duy", "Male", "2/1/1999"));
		st.add(new Student("3", "Long", "Male", "1/4/1999"));
		st.add(new Student("4", "Hai", "Male", "12/5/1999"));
		st.add(new Student("5", "Linh", "Female", "12/12/1999"));
		st.add(new Student("6", "Uyen", "Female", "8/8/1999"));
		st.add(new Student("7", "Tri", "Male", "2/9/1999"));
		st.add(new Student("8", "Nguyen", "Female", "1/1/1999"));
		st.add(new Student("9", "Chuong", "Female", "1/1/1999"));
		st.add(new Student("10", "Son", "Female", "1/1/1999"));

	}
	public Student searchID(int id) {
		for(Student student : st) {
			if(student.getId()==id) {
				return student;
			}
		}
		return null;
	}

	public Student searchName(String name) {
		for(Student student : st) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

	public void addNew(Student s) {
		st.add(s);
	}
	public ArrayList<Student> getAll() {
		return st;
	}
}
