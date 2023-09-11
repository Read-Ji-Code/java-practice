package com.ruby.java.ch07.상속;

public class Student extends Person {
	private String major;
	
	public Student() {
		super();
		System.out.println("Student constructor");
	}
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString()+ ":" + getMajor();
	}
	
}
