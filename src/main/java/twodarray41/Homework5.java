package twodarray41;
/*
 Q5. Row to Column Zero
Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103



Input Format
First argument is a vector of vector of integers.(2D matrix).



Output Format
Return a vector of vector after doing required operations.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,0]
[9,2,0,4]


Example Output
Output 1:

[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


Example Explanation
Explanation 1:

A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */
public class Homework5 {

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