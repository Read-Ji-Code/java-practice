package edu.pnu.jdbc;

import java.util.List;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		MyJDBC mj = new MyJDBC("org.h2.Driver",
				"jdbc:h2:tcp://localhost/~/.h2/jdbcstudy",
				"sa",
				"abcd");
				
		List<List<String>> list = mj.queryWithStatement("select * from testtable");
		mj.printlist(list);
		
		
	}
}
