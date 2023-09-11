package com.ruby.java.ch07.abstraction;

public interface Messenger {
	//String name; 인터페이스에서 필드 선언은 안된다. 상수값만 박을수있음.
 	int MIN_SIZE = 1; //final 상수 값 처리 
	int MAX_SIZE = 104857600;
	public String getMessage(); //추상 메소드 - 인터페이스에 달린 메소드는 선언하면 abstract 자동으로 붙음.  
	public void setMessage(String msg);
	public default void setLogin(boolean login) {
		System.out.println("log in");
	}
	public static void getConnection() {
		System.out.println("static method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
