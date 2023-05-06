package twodarray41;

//GIVEN One matrix mat[n][n] convert it to its transpose. [O(1) space]
public class LessonQuestion5 {

	int[][] transpose(int mat[][]) {

		int n = mat.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[i][j] = temp;
			}
		}

		return mat;
	}

}