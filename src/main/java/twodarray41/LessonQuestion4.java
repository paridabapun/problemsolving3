package twodarray41;

/*
 * 
 * Given a mat [n] [m]. print all diagonals going from R-L
starting from 0th row 0th column.
 */
public class LessonQuestion4 {

	void printAllDiagonals(int mat[][], int n, int m) {
		for (int c = 0; c < m - 1; c++) {
			int i = 0;
			int j = c;
			while (i < n && j >= 0) {
				System.out.println(mat[i][j]);
				i++;
				j--;
			}
		}

		for (int r = 1; r < n; r++) {
			int i = r;
			int j = m - 1;
			while (i < n && j >= 0) {
				i++;
				j--;

			}
		}

	}

	public static void main(String[] args) {

	}
}
