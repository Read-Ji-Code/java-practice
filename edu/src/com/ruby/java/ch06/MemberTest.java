package com.ruby.java.ch06;

public class MemberTest {

class Member {
	private String name;
	private int age;
	private int height;
	
	public Member() {
		name = "lee";
		age = 10;
		height = 170;
	}
	public Member(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Member(String name) {
		this.name = name;
	}
	
	public Member(int age) {
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
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	}
	public static void main(String[] args) {
		Member m1 = new Member();
	}
}
	
