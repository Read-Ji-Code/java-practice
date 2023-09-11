package com.ruby.java.ch02;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = a;
		int d = b;
		System.out.println(a>b);
		System.out.println(a!=b);
		if (a<b && c++ < d)
			System.out.println("a c가 작다");
		else
			System.out.println("b 가 작거나 d가 작다");
		if (a<b & c<d)
			System.out.println(" ");
		else
			System.out.println("a");
	}

}
