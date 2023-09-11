package com.ruby.java.ch11;

public class Test01 {
	
	public static void main(String[] args) {
//	try {
//		int arr[] = new int[3];
//		arr[3]=30;
//		System.out.println("ok");
//		}
//	catch(IndexOutOfBoundsException e) {
//		System.out.println(e.getMessage());
//	}
//	System.out.println("good");
//		try {int arr[] = new int [3];
//		arr[3] = 30;
//		System.out.println("ok");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("hi");
	try {
		String s = new String("java");
		int len = s.length();
		s= null;
		s.length();
		int arr[] = new int[3];
		arr[3] = 30;
		System.out.println("ok");
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println(e1.getMessage());
	}
	catch(NullPointerException e2) {
		System.out.println(e2.getMessage());
	}

	System.out.println("okay");
		
		
	}
}

