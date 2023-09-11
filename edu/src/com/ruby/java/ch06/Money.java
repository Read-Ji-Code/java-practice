package com.ruby.java.ch06;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		System.out.print("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int i;
		int change = sc.nextInt();
		int[] money = {50000, 10000, 5000, 1000};
		
		for (i = 0; i <= money.length; i++) {
			int money1 =change / money[i];
			change = change % money[i];
		System.out.println(money[i] + "원권 :" + money1 + "장"  );
		}
		
		
	}
}
