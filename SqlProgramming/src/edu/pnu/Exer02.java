package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exer02 {
	public static void main(String[] args) {
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "tiger";
			
			//Class.forName(driver);
			Statement st = DriverManager.getConnection(url,username,password).createStatement();
			ResultSet rs = st.executeQuery("select name, population from city where countrycode = 'kor' order by name");
			
			while (rs.next()) {
				System.out.print(String.format("%30s",rs.getString("name")));
				System.out.print(String.format("%10d",rs.getInt("population"))+"\n");
			}
			
			
			rs.close();
			st.close();
			//con.close();
		}catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}
