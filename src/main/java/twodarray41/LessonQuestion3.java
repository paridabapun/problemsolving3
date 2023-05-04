package twodarray41;

/* Given square matrix mat[n][n] print two diagonals 
1 ToflefttrBotlansght
2 TofsighttrBottomLeft*/
public class LessonQuestion3 {

	static void printDigaonals(int mat[][]) {
		int n = mat.length;
		int i = 0;
		int j = 0;
		// PRINTING LEFT TO RIGHT , we are increasing i & j equally
		while (i < n && j < n) {
			System.out.print(mat[i][j] + " ");
			i++;
			j++;
		}
		System.out.println();
		i = 0;
		j = n - 1;
		// PRINTING RIGHT to LEFT , we are increasing i & j equally
		while (i < n && j >= 0) {
			System.out.print(mat[i][j] + " ");
			i++;
			j--;
		}

	}

	public static void main(String[] args) {

//		int mat[][] = new int[2][2];
//		mat[0][0] = 4;
//		mat[0][1] = 5;
//		mat[1][0] = 2;
//		mat[1][1] = 1;

		int mat1[][] = { { 4, 5, 3 }, { 2, 1, 5 }, { 2, 1, 5 } };
		printDigaonals(mat1);
	}

}
