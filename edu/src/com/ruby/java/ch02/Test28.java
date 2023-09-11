package com.ruby.java.ch02;

import java.util.Scanner;

public class Test28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자입력하세요: ");
            int cnt = sc.nextInt();
            System.out.print("홀[o],짝[e],전부[a]: ");
            String flag = sc.next();

            if (cnt <= 0) {
                break;
            }

            int sum = 0;
            int a = 0;
            int b = 0;

            if (flag.equals("a")) {
                a = 1;
                b = 1;
            } else if (flag.equals("o")) {
                a = 1;
                b = 2;
            } else if (flag.equals("e")) {
                a = 2;
                b = 2;
            } else {
                continue;
            }

            for (int i = a; i <= cnt; i += b) {
                sum += i;
                System.out.println("sum: " + sum);
            }
            System.out.println("Final sum: " + sum);
        }
    }
}





//while(true) {
//	System.out.print("숫자를 입력하세요 : ");
//	int cnt = sc.nextInt();
//	if (cnt <= 0) {
//		break;
//	}
//	System.out.print("홀[o],짝[e],전부[a] : ");
//	String flag = sc.next();
//	if (flag.equals('a')) {
//	int sum = 0;
//	for (int i = 1; i <= cnt; i++) {
//		sum += i;
//	}
//	if (flag.equals('e')) {
//	int sum =
//	}
//	System.out.println(sum);
//	}
//}
////