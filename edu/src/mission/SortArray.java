package mission;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

	private int[] initializeArray() {
		Random rd = new Random();
		int[] arr = new int[10];
		int i, j;
		for (i = 0; i < arr.length;) {
			// 1~100사이 값을 임의로 입력받아서 r에 저장
			int r = rd.nextInt(1, 101);
			// 저장된 arr안에서 r이 이미 존재하는지 검사
			for (j = 0; j < i; j++) {
				// arr안에 r이 있으면 break
				if (arr[j] == r)
					break;
			}
			if (i == j) {
				arr[j] = r;
				i++;
			}
		}
		return arr;
	}

	public int[] sorting(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

		return arr;
	}

	public static void main(String[] args) {
		SortArray sorter = new SortArray();
		int[] array = sorter.initializeArray();
		System.out.println("before array: " + Arrays.toString(array));
		int[] array2 = sorter.sorting(array);
		System.out.println("after array: " + Arrays.toString(array2));
	}
}
