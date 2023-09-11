package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exer06 {
	
	static void method(String query) {
		System.out.println("---method---");
		Connection con = null;
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet world = st.executeQuery(query);
			ResultSetMetaData rsmd = world.getMetaData();
			int count = rsmd.getColumnCount();
			
			while(world.next()) {
				for(int i = 1; i <= count; i++) {
				System.out.println(world.getString(i) + ", ");
			}
				System.out.println();
			}
			
			world.close();
			con.close();
			st.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public static void main(String[] args) {
		method("select language, isofficial, percentage from countrylanguage cl, country c where cl.countrycode=c.code and c.code = 'kor'");
	}
}
