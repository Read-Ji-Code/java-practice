package com.ruby.java.ch07.상속;
//클래스 final 다른데서 퍼가서 수정해서 쓰는거안됨.
public class Person {
//private final String SSN_ID = "jbk";
	private String name;
	private int age;
	
//	final 초기화 이후 변경불가능
// 따라서 필드위치에서 초기값 입력 또는 생성자로 초기화 한번 가능 이후 변경 불가.
//	public void setssn_ID(String ssn_ID) {
//		this.SSN_ID = ssn_ID;
//	}
//	
//	public Person(String ssn_ID) {
//		this.SSN_ID = ssn_ID;
//	}
	
	
	
	
	public Person() {
		System.out.println("person 생성자 호출");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//final 더 이상 오버라이드해가서 살붙이는거 불가능 변경불가.
	public String toString() {
		return name + ":" + age;
	}
	
}
