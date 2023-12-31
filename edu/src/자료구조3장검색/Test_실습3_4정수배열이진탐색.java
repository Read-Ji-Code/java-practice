package 자료구조3장검색;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Random;

public class Test_실습3_4정수배열이진탐색 {

	static void inputData(int[] data) {
		Random random = new Random();
		for (int i = 0; i < data.length; i++)
			data[i] = random.nextInt(10);
	}

	static void showData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
	}

	static void swap(int[]data, int ind1, int ind2) {
		int t = data[ind1];
		data[ind1] = data[ind2];
		data[ind2] = t;
	}
	
	static void sortData(int []data) {
		for (int i=0; i < data.length; i++) {
			for (int j=i+1; j < data.length; j++) {
				if (data[i] > data[j]) {
				swap(data, i, j);
				}
			}
		}
	}

	static int linearSearch(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key)
				return i;
		}
		return -1;
	}

	static int binarySearch(int[] a, int key) {
		int pl = 0;
		int pr = a.length -1;
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		

		sortData(data);
		System.out.println();
		
		
		for (int num: data) {
			System.out.print(num+" ");
		}
		
		
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

}
