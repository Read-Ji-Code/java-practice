package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateByStatement {

	public static void main(String[] args) {

		Connection con = null;

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sqltest";
			String username = "scott";
			String password = "tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

			String sql;
			Statement st = con.createStatement();

		
				sql = "update user set enable = false where username like 'user2%'";
				System.out.println(st.executeUpdate(sql));
			
		
			
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
