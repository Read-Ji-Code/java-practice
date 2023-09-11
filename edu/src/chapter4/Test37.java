package chapter4;

import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int cnt =sc.nextInt();
		int [] score = new int[cnt];
		for (i = 0; i < cnt; i++) {
			score[i] = sc.nextInt();
		}
		
		
		
		int sum = 0;
		int max = 500;
		int min = 0;
		double avg;
//		for (i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) 
				max = score[i];
			if (min > score[i])
				min = score[i];
		avg = sum / score.length;
		System.out.println("총 점: " + sum);
		System.out.println(avg);
	}
}
