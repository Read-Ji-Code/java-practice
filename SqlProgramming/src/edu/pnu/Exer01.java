package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


	public class Exer01 {
		public static void main(String[] args) {
			
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/world";
				String username = "scott";
				String password = "tiger";
				
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url,username,password);
				
				System.out.println("연결 성공");
				showData(con, "country");
				con.close();
				
				
			}catch (Exception e) {
				System.out.println("연결 실패 : " + e.getMessage());
			}
			
		}
		
	private static void showData(Connection con, String tablename) throws Exception {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(String.format("select * from %s limit 10", tablename));
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		System.out.println("=".repeat(80));
		System.out.println("Table : " + tablename);
		System.out.println("=".repeat(80));
		
		while (rs.next()) {
			for(int i =1; i <= count; i++) {
				if (i !=1) System.out.print(",");
				System.out.print
				(String.format("%" + rsmd.getColumnDisplaySize(i) + "s", rs.getString(i)));
			}
			System.out.println();
		}
		rs.close();
		st.close();
		
	}

}
