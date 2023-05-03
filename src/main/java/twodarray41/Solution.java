package twodarray41;

public class Solution {

	public int[][] solve(int[][] A) {

		int n = A.length;
		int m = A[0].length;

		// rows
		for (int i = 0; i < n; i++) {
			int flag = 0;
			for (int j = 0; j < m; j++) {

				if (A[i][j] == 0) {
					flag = 1;
				}
			}
			if (flag == 1) {
				for (int j = 0; j < m; j++) {
					if (A[i][j] != 0)
						A[i][j] = -1;

				}
			}
		}

		// columns

		for (int j = 0; j < n; j++) {
			int flag = 0;
			for (int i = 0; i < n; i++) {

				if (A[i][j] == 0) {
					flag = 1;
				}
			}
			if (flag == 1) {
				for (int i = 0; i < n; i++) {
					if (A[i][j] != 0) {
						A[i][j] = -1;
					}
				}
			}
		}

		// Assigning 0 to -1 elements

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i][j] == -1) {
					A[i][j] = 0;
				}

			}
		}

		return A;
	}
}