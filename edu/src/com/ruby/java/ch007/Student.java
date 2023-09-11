package com.ruby.java.ch007;

public class Student extends Person{
	private String major;
	
	public Student() {
		super();
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

	@Override
	public String toString() {
		return super.toString() + ":" + major;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
