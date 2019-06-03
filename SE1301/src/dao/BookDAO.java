package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Book;

public class BookDAO extends Book{
	
	public BookDAO(String bookID, String title, String author, String category, String keyword) {
		super(bookID, title, author, category, keyword);
		// TODO Auto-generated constructor stub
	}
	public static Connection conn = null;
	public static PreparedStatement ps=null;
	public static ResultSet rs=null;

	public static boolean  search(String BookID) {
		boolean st=false;
		String select = "select * from Books where BookID=?";
		try {
			conn = DataBaseConfig.getConnection("DESKTOP-EUBI85S\\DUONGDO990", "FULib", "sa", "duong");
			ps = conn.prepareStatement(select);
			ps.setString(1, BookID);
			rs =ps.executeQuery();
			while(rs.next()) {
				Book.setBookID(rs.getString("BookID"));
				Book.setAuthor(rs.getString("Author"));
				Book.setCategory(rs.getString("Category"));
				Book.setKeyword(rs.getString("Keyword"));
			}
			System.out.println(rs.getString("BookID"));
			getBook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
	public static Book getBook() {
		try {
			rs =ps.executeQuery();
			while(rs.next()) {
				Book.setBookID(rs.getString("BookID"));
				Book.setAuthor(rs.getString("Author"));
				Book.setCategory(rs.getString("Category"));
				Book.setKeyword(rs.getString("Keyword"));
			}
			System.out.println(rs.getString("Keyword"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		search("B0001");
	}
}
