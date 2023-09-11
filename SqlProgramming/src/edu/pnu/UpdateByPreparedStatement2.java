package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateByPreparedStatement2 {

	public static void main(String[] args) {
		
		Connection con = null;
		Scanner sc =new Scanner(System.in);
		System.out.print("True False : ");
		boolean up1 = sc.nextBoolean();
		System.out.print("username : ");
		String up2 =sc.next();
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/sqltest";
			String username = "scott";
			String password = "tiger";
			
			Class.forName(driver);
			con =DriverManager.getConnection(url, username, password);
			String sql;
			PreparedStatement pt = con.prepareStatement( "update user set enable = ? where username like ?");
			pt.setBoolean(1, up1);
			pt.setString(2, up2);
			int ps = pt.executeUpdate();
			System.out.println(ps);
			pt.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
