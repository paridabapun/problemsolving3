package slidingwindow42;

/*
 * Given a mat n*n print the boundary elements in clockwise direction till centre element .
 * (Special printing)
 */
public class LessonQuestion4 {

	static void printBoundaryElement(int mat[][]) {

		int n = mat.length;

		int i = 0;
		int j = 0;

		for (int k = 1; k <= n - 1; k++) {
			System.out.print(mat[i][j] + " ");
			j++;
		}

		for (int k = 1; k <= n - 1; k++) {
			System.out.print(mat[i][j] + " ");
			i++;
		}
		for (int k = 1; k <= n - 1; k++) {
			System.out.print(mat[i][j] + " ");
			j--;
		}
		for (int k = 1; k <= n - 1; k++) {
			System.out.print(mat[i][j] + " ");
			i--;
		}

	}

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printBoundaryElement(mat);
	}

}
