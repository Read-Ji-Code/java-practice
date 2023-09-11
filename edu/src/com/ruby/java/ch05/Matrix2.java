package com.ruby.java.ch05;

import java.util.Random;
import java.util.Random.*;

public class Matrix2 {

	static int[][] addMatrix(int[][] a, int[][] b) {
		int c[][] = new int[4][5];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b[0].length; j++)
				c[i][j] = a[i][j] + b[i][j];
		return c;
	}

	static int[][] multiplyMatrix(int[][] a, int[][] b) {
		int sum = 0;
		int c[][] = new int[4][5];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b[0].length; j++) {
				sum = 0;
				for (int k = 0; k < a[0].length; k++)
					sum += a[i][k] * b[k][j];
				c[i][j] = sum;
			}
		return c;
	}

	public static void main(String[] args) {
		Random random = new Random();
		int a[][] = new int[4][5];
		int b[][] = new int[4][5];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = random.nextInt(3);

		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = random.nextInt(3);
		
		int[][] sumMatrix = addMatrix(a, b);
		
		int c[][] = new int[5][5];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				c[i][j] = random.nextInt(3);
		
		int[][] productMatrix = multiplyMatrix(a,c);
		show(a);
		System.out.println();
		show(c);
		System.out.println();
		show(sumMatrix);
		System.out.println();
		show(productMatrix);
		System.out.println();
		
	}
	public static void show(int[][]b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
	}
}
