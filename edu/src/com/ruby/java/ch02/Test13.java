package com.ruby.java.ch02;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0b00010001;
		byte b = 0b00100010;
		int c = a | b;
		System.out.println(Integer.toBinaryString(c));
		System.out.println(c);
		int f = 12;
		int h = f << 1;
		int g = (~f) + 1;
		System.out.println("h=" + h);
		
	}

}
