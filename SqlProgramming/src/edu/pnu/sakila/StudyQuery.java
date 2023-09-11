package edu.pnu.sakila;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class StudyQuery {

	
	private void printResult(List<List<String>> list) {
		for(List<String> row : list) {
			System.out.println();
	}
		System.out.println();
	}

	
	private List<List<String>> getQueryResult(Connection con, String tablename) {
		// prepareStatement / Statement
		Statement st;
		try {
			st = con.createStatement();
			// resultset ==> String[]
			ResultSet rt = st.executeQuery("select * from " +tablename);
		    //데이터 빼와서 배열에 담아야함.
			ResultSetMetaData rsmd = rt.getMetaData();
			int count = rsmd.getColumnCount();
			
			while (rt.next()) {
				for(int i =1; i <= count; i++) {
					if (i !=1) System.out.print(",");
					System.out.print
					(String.format("%" + rsmd.getColumnDisplaySize(i) + "s", rt.getString(i)));
				}
				System.out.println();
			}		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	private Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3308/sakila";
		String username = "admin";
		String password = "appleasd1!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

	
	
	public static void main(String[] args) throws Exception {
		// 인스턴스 생성
		StudyQuery sq = new StudyQuery();

		// 데이터베이스 연결 (con)
		Connection con = sq.getConnection();

		Scanner sc = new Scanner(System.in);
	
		System.out.print("테이블명을 입력하세요 :");
		String tablename = sc.next();
		String str = "select * from " + tablename;
		// 질의 (결과로서 배열을 받는다)	
		List<List<String>> list = sq.getQueryResult(con, tablename);
		// 결과 출력
		sq.printResult(list);
		}
	}

