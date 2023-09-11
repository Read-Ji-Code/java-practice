package mission;

import java.util.Random;

public class SelectionSort {
	Random rd = new Random();
	int[] arr = new int[10];
	int i, j;for(i=0;i<arr.length;)
	{
		int r = rd.nextInt(1, 101);
		for (j = 0; j < i; j++) {
			if (arr[j] == r)
				break;
		}
		if (j == i)
			arr[i++] = r;
	}return arr;

}
