package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Student;

public class StudentDAO {
	static Student temp=null;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(
					"jdbc:sqlserver://DESKTOP-EUBI85S\\DUONGDO990:1433;databaseName=Student"
					, "sa", "duong");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	// Tao List de hien thi du lieu
	public static List<Student> getListStudent(){
		String sql = "Select * from Student";
		List<Student> listStudent = new ArrayList<Student>();
		try (Connection cc = getConnection()){
			Statement statement = cc.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("Id");
				String name = rs.getString("Name");
				boolean gender = rs.getBoolean("Gender");
				String date = sdf.format(rs.getDate("DOB"));
				temp = new Student(id, name, gender, date);
				listStudent.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listStudent;
	}
	// Tao student cho CSDL
	public static boolean createStudent(String name,boolean Gender,Date dob) {
		String insert = "insert into Student values(?,?,?)";
		try (Connection c = getConnection()){
			PreparedStatement ps = c.prepareStatement(insert);
			ps.setString(1, name);
			ps.setString(2, Boolean.toString(Gender));
			ps.setString(3, sdf.format(dob));
			ps.executeUpdate();
			c.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	//Xoa Student trong CSDL
	public static boolean deleteStudent(int id) {
		String delete = "DELETE FROM Student WHERE Id=?";
		try (Connection cc = getConnection()){
			PreparedStatement pss = cc.prepareStatement(delete);
			pss.setString(1, Integer.toString(id));
			pss.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Student search(int id) {
		for(Student st: getListStudent()) {
			if(st.getId()==id) {
				return st;
			}
		}
		return null;
	}
	// Update Student cho CSDL
	public static boolean updateStudent(String name,boolean gender,Date date,int oldID) {
		String update = "UPDATE Student SET Name=?,Gender=?,DOB=? WHERE Id = ?";	
		try (Connection ccc = getConnection()){
			PreparedStatement pss = ccc.prepareStatement(update);
			pss.setString(1, name);
			pss.setString(2, Boolean.toString(gender));
			pss.setString(3, sdf.format(date));
			pss.setString(4, Integer.toString(oldID));
			pss.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
