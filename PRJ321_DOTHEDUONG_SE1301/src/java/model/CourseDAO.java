package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CourseDAO{

	public static ArrayList<Course> getAll(){
		String sql  = "select * from Course_DOTHEDUONG_SE1301";
		Course c = null;
		ArrayList<Course> listCourse = new ArrayList<>();
		try (Connection conn = DBConfig.getConnection()){
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String courseID = rs.getString("CourseID");
				String courseName = rs.getString("CourseName");
				String lecture = rs.getString("Lecture");
				int room = rs.getInt("Room");
				c = new Course(courseID, courseName, lecture, room);
                                listCourse.add(c);
			}
			rs.close();
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCourse;
	}
	public static boolean newCourse(Course c) {
		String sql = "insert into Course_DOTHEDUONG_SE1301 values(?,?,?,?)";
		try (Connection conn = DBConfig.getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCourseID());
			ps.setString(2, c.getCourseName());
			ps.setString(3, c.getLecture());
			ps.setInt(4, c.getRoom());
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
