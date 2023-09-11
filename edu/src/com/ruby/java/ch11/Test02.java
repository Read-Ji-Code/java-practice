package com.ruby.java.ch11;

public class Test02 {
	
	public static void main(String[] args) {
		try {
			System.out.println("1");
//			int a = 1;
//			int b = 0;
//			int div = a/b;
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("OK");
		}
		System.out.println("4");
	
		
	}
}
