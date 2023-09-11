package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exer05 {
	
	static void method1(String query) {
		System.out.println("------method1------");
		Connection con = null;
		
		try {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/world";
		String username = "scott";
		String password = "tiger";
		
		Class.forName(driver);
		Statement st = DriverManager.getConnection(url, username, password).createStatement();
		ResultSet world = st.executeQuery(query);
		ResultSetMetaData rsmd = world.getMetaData();
		int count = rsmd.getColumnCount();
		
	
		while (world.next()) {
			for (int i =1; i <= count; i ++) {
				System.out.print(world.getString(i) + ", ");
			}
			System.out.println();
		}
	
		world.close();
		st.close();
		con.close();	
		
		}catch (Exception e) {
			System.out.println("연결실패 : " + e.getMessage());
		}	
	}
	public static void main(String[] args) {
		
		method1("select name, population from city where population >= 1000000 and countrycode = 'kor' order by population");
		method1("select name, population from city where population >= 1000000 and population <=5000000 and countrycode = 'kor' limit 10");
	}
}
