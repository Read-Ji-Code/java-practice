package chapter4;

public class Test40 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i <arr.length; i++ ) {
			for (int j = 0; j <arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
