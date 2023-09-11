package com.ruby.java.ch09;

import java.util.Arrays;

public class Test16 {
	
	public static void main(String[] args) {
		int score[] = { 85, 90, 14, 95, 100, 75 };
		Arrays.sort(score);
		for (int num : score) {
			System.out.println(num);
		}
//		int score2[] = Arrays.copyOf(score, score.length);
//		int score3[] = Arrays.copyOfRange(score, 3, 5);
		String s1 = Arrays.toString(score);
		System.out.println(s1);
		Arrays.binarySearch(score, 14);
}
}
