package chapter4;

public class Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i <arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				if (i==j)
				System.out.println(arr[i][j]);
				
			}
		}
	}

}
