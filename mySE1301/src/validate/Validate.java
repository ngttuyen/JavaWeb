package validate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate
 {
     public static boolean checkUser(String user,String pass) 
     {
      boolean st =false;
      try{
    	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection con=DriverManager.getConnection	
     ("jdbc:sqlserver://DESKTOP-EUBI85S\\DUONGDO990:4343;databaseName=FULib", "sa", "duong");
         PreparedStatement ps =con.prepareStatement
                             ("select * from Users where UserID = ? and Password =?");
         ps.setString(1, user);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
     } 
     
     public static void main(String[] args) {
		System.out.println(checkUser("U0003", "1234"));;
	}
}