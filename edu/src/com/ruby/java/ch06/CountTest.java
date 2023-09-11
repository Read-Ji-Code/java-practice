package com.ruby.java.ch06;

class Count {
	public static int totalcount;
	int count;
}
public class CountTest {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;
		Count.totalcount++;
		c2.count++;
		Count.totalcount++;
		c3.count++;
		Count.totalcount++;
		
		System.out.println(Count.totalcount + " : " + c1.count);
		System.out.println(Count.totalcount + " : " + c2.count);
		System.out.println(Count.totalcount + " : " + c3.count);
	}
}
