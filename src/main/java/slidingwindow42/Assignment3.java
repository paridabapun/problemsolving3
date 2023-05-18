package slidingwindow42;

public class Assignment3 {
	

	public static int[][] generateMatrix(int A[][]) {
		
		
		

		
		int n =0;
		 int mat[][] = new int[n][n];
		int i = 0;
		int j = 0;
		while (n > 1) {

			for (int k = 1; k <= n - 1; k++) {
				mat[i][j] = A[i][j];

				j++;
			}

			for (int k = 1; k <= n - 1; k++) {
				mat[i][j] = A[i][j];
				i++;
			}
			for (int k = 1; k <= n - 1; k++) {
				mat[i][j] = A[i][j];
				j--;
			}
			for (int k = 1; k <= n - 1; k++) {
				mat[i][j] = A[i][j];
				i--;
			}
			i++;
			j++;
			n -= 2;
		}

	

		return mat;
	}
	public static void main(String[] args) {

		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		generateMatrix(mat1);
		
	}

}
