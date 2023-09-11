package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateByPreparedStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sqltest";
			String username = "scott";
			String password = "tiger";
			
			Class.forName(driver);
			con =DriverManager.getConnection(url, username, password);
			String sql;
			PreparedStatement pt = con.prepareStatement( "update user set enable = false where username like ?");
			pt.setString(1, "user3%");
			int ps = pt.executeUpdate();
			System.out.println(ps);
			pt.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
