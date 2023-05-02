package subarrays40;
/* Q7. Generate all subarrays




Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array


Problem Constraints
1 <= N <= 100
1 <= A[i] <= 105


Input Format
First argument A is an array of integers.


Output Format
Return a 2D array of integers


Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [5, 2, 1, 4]


Example Output
Output 1:
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
Output 2:
[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]


Example Explanation
For Input 1:
All the subarrays of the array are returned. There are a total of 6 subarrays.
For Input 2:
All the subarrays of the array are returned. There are a total of 10 subarrays. */
public class Assignment4 {
	public int[][] solve(int[] A) {
		int n = A.length;
		int arr[][] = new int[(n*(n+1))/2][];
		int row =0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				arr[row] = new int[j-i+1];
				for (int k = i; k <= j; k++) {
					//TODO -- how to decide the array size bla bla
					arr[row][k-i] = A[k];
				
				}
				row++;
			}
		}

        return arr;

	}
}
