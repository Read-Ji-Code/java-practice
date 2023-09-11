package mission;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("number : ");
		int num = sc.nextInt();
		if (num <=2) {
			System.out.println("더 큰 수를 입력하세요");
			return;
		}
		int i;
		int len = num / 2;
		for (i = 2; i <= len; i++ ) {
			if (num % i==0)
				break;
		}
		if (len < i) {
			System.out.println("소수");
			return;
		}
		System.out.println("아님");
	}
}
