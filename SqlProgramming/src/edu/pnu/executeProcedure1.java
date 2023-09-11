package edu.pnu;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class executeProcedure1 {
	
	 public static Connection getConnection() {
	        Connection con = null;
	        try {
	            String driver = "com.mysql.cj.jdbc.Driver";
	            String url = "jdbc:mysql://localhost:3306/sqltest";
	            String username = "scott";
	            String password = "tiger";

	            Class.forName(driver);
	            con = DriverManager.getConnection(url, username, password);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return con;
	    }
	
	public static executeProcedure1(Connection con) {
		
		try {
			CallableStatement cs = con.prepareCall("Call myStoredProc2(?)");
			cs.setString(1, "south korea");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("language")+","); 
				System.out.println(rs.getString("isofficial")+","); 
				System.out.println(rs.getString("percentage")+","); 
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Connection con = getConnection();
		executeProcedure1(con);
	}

}
