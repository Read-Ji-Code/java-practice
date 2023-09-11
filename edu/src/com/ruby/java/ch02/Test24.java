package com.ruby.java.ch02;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nation;
		Scanner sc = new Scanner(System.in);
		System.out.print("국가 입력 하세요 : ");
		nation = sc.next();
		
		switch(nation) {
		case "KOR":
		case "JPN":
		case "CHN":
			System.out.println("아시아");
			break;
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("유럽");
			break;
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("아메리카");
			break;
		default :
			System.out.println("정확하게 입력하세요");
		}
	}
}
