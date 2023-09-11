package com.ruby.java.ch02;

import java.util.Scanner;

public class Test20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		char plus = ' ';
		System.out.print("점수를 입력하세요 : " );
		int Score = sc.nextInt();
	
		
		if(Score >= 95) {
			grade  = 'a';
			plus = '+';
		} else if(Score >= 90) {
			grade = 'a';
		} else if(Score >= 80) {
			grade = 'b';
		} else if(Score >= 70) {
			grade = 'c';
		} else if(Score >= 60) {
			grade = 'd';
		} else {
			grade = 'f';
		}
		System.out.print("성적은 : " + grade);
		System.out.println(plus);
	}
}
