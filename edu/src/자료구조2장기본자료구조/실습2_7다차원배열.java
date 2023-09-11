package 자료구조2장기본자료구조;

//3번 실습
//교재 62 - 두 배열의 비교
//교재 79 - 다차원배열
import java.util.Random;

public class 실습2_7다차원배열 {

	static void inputData(int[][] data) {
		 Random random = new Random();
	        for (int i = 0; i < data.length; i++)
	            for (int j = 0; j < data[0].length; j++)
	                data[i][j] = random.nextInt(10);
	    
	}

	static void showData(int[][] items) {
	    for (int i = 0; i < items.length; i++) {
	        for (int j = 0; j < items[i].length; j++) {
	            System.out.print(items[i][j] + " ");
	        }
	        System.out.println();
	    }
	}


	static boolean equals(int[][] a, int[][] b) {
	    if (a.length != b.length || a[0].length != b[0].length) {
	        return false;
	    }

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[0].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                return false;
	            }
	        }
	    }

	    return true;
	}


	static int[][] addMatrix(int[][] X, int[][] Y) {
		int[][] Z = new int[X.length][X[0].length];
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X[0].length; j++) {
				Z[i][j] = X[i][j] + Y[i][j];
			}
		}
		return Z;

	}

	static int[][] multiplyMatrix(int[][] A, int[][] B) {
		int sum = 0;
		int[][] C = new int[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				sum = 0;
				for (int k = 0; k < A[0].length; k++) {
					sum += A[i][k] * B[k][j];
					C[i][j] = sum;
				}
			}
		}
		return C;
	}

	static int[][] transposeMatrix(int[][] data) {
	    int rows = data.length;
	    int cols = data[0].length;

	    int[][] transposed = new int[cols][rows];

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            transposed[j][i] = data[i][j];
	        }
	    }

	    return transposed;
	}

	public static void main(String[] args) {
		int[][] A = new int[2][3];
		int[][] B = new int[3][4];
		int[][] C = new int[2][4];
		int[][] D = new int[2][3];
		
		inputData(A);
		inputData(B);
		inputData(C);
		inputData(D);
		System.out.println("A[][]");
		showData(A);
		System.out.println("B[][]");
		showData(B);
		System.out.println();

		System.out.println("D[][]");
		showData(D);

		int[][] E = addMatrix(A, D);
		System.out.println("E[][]");
		showData(E);
		
		System.out.println("F[][]");
		int[][] F = multiplyMatrix(A,B);
		showData(F);
		System.out.println("G[][]");
		int [][]G = transposeMatrix(A);
		showData(G);

		boolean result = equals(A, D);
		System.out.println(" equals(A,D) = " + result);
	}

}
