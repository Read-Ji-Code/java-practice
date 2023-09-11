package com.ruby.java.ch02;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score : " );
		
		int score = sc.nextInt();
		
		String result = "";
		
		if(score >= 60) {
			result = "합격";
		}
		else {
			result = "불합격";
		}
		System.out.println(result);
		}
	}

