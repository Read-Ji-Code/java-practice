package com.ruby.java.ch07.상속;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		super();
		System.out.println("Professor constructor");
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + ":" + getSubject();
	}
	
	
	
}
