package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;

public class ProductDAO {
	public static ArrayList<Product> productList(){
		String select = "select * from Product";
		Product p = null;
		ArrayList<Product> pList = new ArrayList<Product>();
		try (Connection con = DBConfig.getConnection()){
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				int ProductID = rs.getInt(1);
				String ProductName = rs.getString(2);
				String ProductType = rs.getString(3);
				int Stock = rs.getInt(4);
				int Price = rs.getInt(5);
				String img = rs.getString(6);
				p = new Product(ProductID, Stock, Price, ProductName, ProductType, img);
				pList.add(p);
			}
			rs.close();
			st.close();
			con.close();
			return pList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Product searchByName(String name) {
		String sql = "select * from Product Where ProductName=?";
		Product p = null;
		try (Connection con = DBConfig.getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int ProductID = rs.getInt(1);
				String ProductName = rs.getString(2);
				String ProductType = rs.getString(3);
				int Stock = rs.getInt(4);
				int Price = rs.getInt(5);
				String img = rs.getString(6);
				p = new Product(ProductID, Stock, Price, ProductName, ProductType, img);
			}
			rs.close();
			ps.close();
			con.close();
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Product c = searchByName("SexToy");
		System.out.println(c.getPrice());
	}
}
