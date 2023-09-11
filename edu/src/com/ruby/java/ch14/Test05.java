package com.ruby.java.ch14;

import java.util.Scanner;

interface NumberFunc {
	int func(int n, int m);
}

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개 입력  ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		NumberFunc sum = (n, m ) -> {
			int result = 0;
			for (int i = n; i <= m; i++) {
				result += i;
			}
			return result;
		};
		if (num < num2) {
		System.out.println(num + "부터 "+ num2 + "까지 합 : " + sum.func(num, num2));
		} else { 
			System.out.println(num2 + "부터 "+ num + "까지 합 : " + sum.func(num2, num));
		}
	}
}
