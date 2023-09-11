package mission;

import java.util.Random;

public class SelectionSort2 {

    public static int[] generateRandomArray(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ) {
            int r = rd.nextInt(101); 
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == r) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr[i++] = r;
            }
        }
        return arr;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10); 
        selectionSort(arr); 
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
