package com.ruby.java.ch08.polymorphism;

abstract class Employee {// 추상 클래스
	String name;
	int salary;
	public abstract void calcSalary(); // 추상 메소드
	public void show() {
		System.out.println("name = " + name + "salary" + " : ");
	}
}

class Salesman extends Employee {
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman");
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant");
	}
}

class Manager extends Employee { // abstract 추상 클래스 만들면 매인에서 인스턴스에 못올림
	
	public void calcSalary() { //추상 메소드를 구현
		System.out.println("Manager");
	}
}

class Director extends Employee {
	public void calcSalary() {
		System.out.println("Director");
	}
}


public class HRSTest {
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			Salesman s =(Salesman) e;
			System.out.println(e + "는 세일즈맨 객체 ");
			System.out.println(s.annual_sales);
		}
		double tax =0;
		if (e.getClass().getName() == "Director")
			tax = e.salary * 0.2;
		else tax = e.salary * 0.1;
		System.out.println("세일즈맨 세금 = " + tax);
	}
	public static void main(String[] args) {
		//Employee e = new Employee(); 추상 클래스라서 내용이없어서 인스턴스에 못올림
		
		Employee s = new Salesman(); 
		Employee d = new Director();
		Employee c = new Consultant();  //인스턴스에 올림
		Employee m = new Manager();
		
		s.calcSalary();
		c.calcSalary(); //힙에 저장된 주소로 메소드 불러냄
		d.calcSalary();
		m.calcSalary();
	}

}
