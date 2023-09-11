package com.ruby.java.ch007;

public class HRSTest {
	
	
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("oji");
		e.setAge(47);
		e.setDept("counter");
		
		p.setName("kpr");
		p.setAge(52);
		p.setSubject("bigdata");
		
		s.setName("kub");
		s.setAge(20);
		s.setMajor("computerScience");
		
		
		Object arr[] = {e, p, s};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
	}
}
