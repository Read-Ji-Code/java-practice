package com.ruby.java.ch07.abstraction;

abstract class Employee {// 추상 클래스
	String name;
	int salary;

	public abstract void calcSalary(); // 추상 메소드
	public void show() {
		System.out.println("name = " + name + "salary" + " : ");
	}
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant");
	}
}

class Manager extends Employee { // abstract 박아서 추상 클래스 만들면 매인에서 인스턴스에 못올림
	public void calcSalary() { //추상 메소드를 구현
		System.out.println("Manager");
	}
}

//class Director extends Employee {
//	 
//	
//}

public class HRSTest {
	public static void main(String[] args) {
		//Employee e = new Employee(); 추상 클래스라서 내용이없어서 인스턴스에 못올림
		Salesman s = new Salesman(); 
		Consultant c = new Consultant();  //인스턴스에 올림
		Manager m = new Manager();
		
		s.calcSalary();
		c.calcSalary(); //힙에 저장된 주소로 메소드 불러냄
		m.calcSalary();
	}

}
