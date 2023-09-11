package com.ruby.java.ch08.innerClass;
//클래스를 외부 클래스로 정의하여 사용 - 내부 클래스와의 차이점을 실습
public class 객체배열 {
class Student {
	int sid;
	String sname;
	public Student() {}
	public Student(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "sid = " + sid + ", sname = " + sname;
	}
	void show(int num) {
		System.out.println("sset[" + num + "] :: " + this.toString());
	}
}

public static void main(String[] args) {
	객체배열 obj = new 객체배열();
	Student sset = obj.new Student();
	int[] arr = new int[10];
	Student[] sset = obj.newStudent[3];
	sset[0] = new Student(10,"hong");
	sset[1] = new Student(11,"kim");
	sset[2] = new Student(12,"lee");
	for (int i = 0; i < 3; i++)
		sset[i].show(i);
}
}
