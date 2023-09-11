package com.ruby.java.ch02;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char op = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("a 값 입력 : ");
		a = sc.nextInt();
		System.out.print("b 값 입력 : ");
		b = sc.nextInt();
		System.out.print("연산자 입력 : ");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(a + b); break;
		case '-':
			System.out.println(a - b); break;
		case '*':
			System.out.println(a * b); break;
		case '/':
			System.out.println(a / b); break;
		default:
            System.out.println("Error: Invalid operator.");
		}
		
	}

}
