package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Exer005 {
	
	
	
	public static void main(String[] args) {
		
Connection con = null;
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement pt = con.prepareStatement("select id, name, countrycode, district, population from city where name=?");
			pt.setString(1, "Seoul");
			ResultSet rs = pt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			
			while(rs.next()) {
				for (int i =1; i <= count; i ++) {
					System.out.print(rs.getString(i) + ", ");
				}
				System.out.println();
				
			}
			
			rs.close();
			pt.close();
			con.close();
			
		}catch (Exception e) {
			System.out.println("연결 실패 :" + e.getMessage());
		}
	}
}
