package twodarray41;
//Given matrix  mat[n][m]print row wise sum.
public class LessonQuestion1 {
	
	static void rowsum(int mat[][]) {

		int n = mat.length;
		int m = mat[0].length;

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += mat[i][j];

			}
			System.out.print(sum + " ");
		}

	}
	
	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		mat[0][0] = 4;
		mat[0][1] = 5;
		mat[1][0] = 2;
		mat[1][1] = 1;
		
		int mat1[][] = {{4,5},{2,1}};
		rowsum(mat1);
	}

}
