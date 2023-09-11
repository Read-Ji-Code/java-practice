package mission;

public class Matrix {
	
	 int[][] multi(int[][] a, int[][] b) {
		int sum=0;
		int c[][] = new int[3][3];
	for( int i=0; i <a.length; i++ ) {
		for (int j = 0; j < b[0].length; j++) {
				sum=0;
			for (int k =0; k < a[0].length; k++) {
				sum += a[i][k] * b[k][j];
				c[i][j] = sum;
			}
		}
	}
	return c;
	}
	
	
	static void printMatrix(int[][] multi) {
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[0].length; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

	public static void main(String[] args) {
		  Matrix matrix = new Matrix();
		  int[][] a = { 
					{ 1, 2, 3, 4 }, 
					{ 1, 2, 3, 4 }, 
					{ 1, 2, 3, 4 } 
					};

			int[][] b = { 
					{ 1, 2, 3 }, 
					{ 1, 2, 3 }, 
					{ 1, 2, 3 }, 
					{ 1, 2, 3 } 
					};

	        int[][] result = matrix.multi(a, b);
	        printMatrix(result);
	
	}
}
