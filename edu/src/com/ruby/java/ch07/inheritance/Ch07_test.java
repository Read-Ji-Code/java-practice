package com.ruby.java.ch07.inheritance;

//7장 실습할 과제로 부과 
class Person {
	int pid;
	String name;
	int age;

	public Person(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

	public String toString() {
		return "[pid=" + pid + ", name=" + name + ", age=" + age + "]";
	}
}


class Student extends Person {
	int sid;
	String dept;
	int year;
	
	public Student(int pid, String name, int age, int sid, String dept, int year) {
		super(pid, name, age);
		this.sid = sid;
		this.dept = dept;
		this.year = year;
	}
	public String toString() {
		return super.toString()+ "sid" +sid +"dept"+ dept + "year"+ year;
	}
}


	class Employee extends Person {
		int eno;
		String dept;
		int salary;
		
		public Employee(int pid, String name, int age, int eno, String dept, int salary) {
			super(pid, name, age);
			this.eno = eno;
			this.dept = dept;
			this.salary = salary;
		}
		public String toString() {
			return super.toString() + "eno" + eno + "dept" + dept + "salary" + salary;
	}

	public class Ch07_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person arr[] = new Person[5];
		arr[0] = new Student(230810, "hong", 23, 0401, "k-digital", 4);
		arr[1] = new Student(230811, "jbk", 31, 0402, "k-digital", 4);
		
		
		for(Person p : arr) {
			System.out.println(p.toString());
		}

	}
	
	}
}
