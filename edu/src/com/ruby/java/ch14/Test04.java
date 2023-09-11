package com.ruby.java.ch14;

import java.util.Scanner;

interface Verify2 {
	boolean check(int n, int d);
}

public class Test04 {
	public static void main(String[] args) {
		Verify2 vf = (num, div) -> (num % div) == 0;
		Scanner sc = new Scanner(System.in);

		int n, d;

		while (True) {
			System.out.print("숫자 두개 입력 하세요 : ");
			if ((n = sc.nextInt()) == 0)
				break;
			;
			if (d == 0)
				break;

			if (vf.check(n, d)) {
				System.out.println("n은 d의 배수입니다");
			} else {
				System.out.println("아닙니다");
			}
			System.out.println("done");

		}
	}
}
