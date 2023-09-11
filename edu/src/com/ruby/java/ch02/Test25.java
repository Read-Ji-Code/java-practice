package com.ruby.java.ch02;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자 입력하세여 :");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int sum = 0
;		for(int i = 0; i< num; i+=2) {
//			System.out.println(i);
		sum += i;
		System.out.println(sum);
		}
		System.out.println("끝");
	}

}
