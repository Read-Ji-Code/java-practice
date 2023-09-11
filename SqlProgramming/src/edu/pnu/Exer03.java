package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exer03 {
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			
			con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet city = st.executeQuery("select countrycode, population from city order by countrycode and population desc limit 100");
			ResultSetMetaData rsmd = city.getMetaData();
			int count = rsmd.getColumnCount();
			while (city.next()) {
				for ( int i =1; i<=count; i++) {
					if (i !=1) System.out.print(", ");
					System.out.print(city.getString(i));
				}
				System.out.println();
			}
			city.close();
			st.close();
			con.close();
			} catch (Exception e) {
				System.out.println("연결실패 : "  + e.getMessage());
			}
	}
}
