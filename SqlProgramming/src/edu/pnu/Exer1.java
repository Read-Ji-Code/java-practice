package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exer1 {

	public static void main(String[] args) { 
		Connection con = null;
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			// String url = "jdbc:mysql://10.125.121.206:3306/world";
			String username = "scott";
			String password = "tiger";

			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

			Statement st = con.createStatement();
			ResultSet city = st.executeQuery("select id,name,countrycode,district,population from city limit 10");

			while (city.next()) {
				 System.out.print(String.format("%10d",city.getInt("id")));
				 System.out.print(String.format("%20s",city.getString("name")));
				 System.out.print(String.format("%10s",city.getString("countrycode")));
				 System.out.print(String.format("%20s",city.getString("district")));
				 System.out.print(String.format("%10d",city.getInt("population"))+"\n");
			}
			city.close();
		
	
			ResultSet countryl = st.executeQuery("select countrycode,language,isofficial,percentage from countrylanguage limit 10");
	
			while (countryl.next()) {
				 System.out.print(String.format("%10s",countryl.getString("countrycode")));
				 System.out.print(String.format("%20s",countryl.getString("language")));
				 System.out.print(String.format("%20s",countryl.getString("isofficial")));
				 System.out.print(String.format("%10d",countryl.getInt("percentage"))+"\n");
			}
			
			ResultSet country = st.executeQuery("select * from country limit 10");
			ResultSetMetaData rsmd =country.getMetaData();
			int count = rsmd.getColumnCount();
			while (country.next()) {
					for ( int i = 1; i <=count ; i++) {
						if (i != 1) System.out.print(", ");
						System.out.println(country.getString(i));
					}
					System.out.println();
			}
			countryl.close();
			st.close();
			con.close();
	
		} catch (Exception e) {
			System.out.println("연결 실패 : " + e.getMessage());
		}
	}
}

