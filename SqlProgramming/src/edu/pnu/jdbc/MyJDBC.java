package edu.pnu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import edu.pnu.jdbc.JDBCTest;

public class MyJDBC {

	private String driver;
	private String url;
	private String user;
	private String pwd;

	public MyJDBC(String driver, String url, String user, String pwd) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pwd = pwd;

	}

	public List<List<String>> queryWithStatement(String query) {
		//출력할 2차원 리스트 생성
		List<List<String>> li = new ArrayList<>();
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			Statement st = con.createStatement();
			//매개변수로 받은 쿼리를 삽입
			ResultSet world = st.executeQuery(query);
			//쿼리 쏴서 받은 데이터 정보 저장
			ResultSetMetaData rsmd = world.getMetaData();
			//데이터 정보에 있는 따옴표수 저장
			int count = rsmd.getColumnCount();
			//반복문 시작
			while (world.next()) {
				//열 데이터를 담을 1차원 리스트 생성
				List<String> row = new ArrayList<>();
				//루프 돌면서 컬럼 끝까지 리스트에 저장
				for (int i = 1; i <= count; i++) {
					row.add(world.getString(i));
				}
				//루프 한번 끝날때마다 2차원 리스트에 저장
				li.add(row);

				

			}
			//끝까지 돌았으니 닫음
			world.close();
			con.close();
			st.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//저장한 2차원 리스트를 리턴해줌
		return li;
	}
	//저장된 2차원 리스트를 매개변수로 받음
	public void printlist(List<List<String>> list) {
	//루프 돌면서 하나씩 반복출력	
		for (List<String> li : list)
			System.out.println(li);
		}

}
