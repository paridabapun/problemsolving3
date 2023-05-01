package carryforward39;
/*
 * Q4. Closest MinMax

 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */
public class Assignment3 {
	int getMin(int[] A, int n) {

		int min = A[0];

		for (int i = 1; i < n; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		return min;
	}

	int getMax(int[] A, int n) {
		int max = A[0];

		for (int i = 1; i < n; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}

	public int solve(int[] A) {

		int n = A.length;
		int lastMin = -1;
		int lastMax = -1;
		int ans = n;
		int min = getMin(A, A.length);
		int max = getMax(A, A.length);
		for (int i = 0; i < n; i++) {
			// THIS LOGIC is BEST
			if (A[i] == min) {
				lastMin = i;
			}

			// FOR max

			if (A[i] == max) {
				lastMax = i;
			}

			if (lastMin != -1 && lastMax != -1) {
				int len = Math.abs(lastMax - lastMin) + 1;

				if (len < ans) {
					ans = len;
				}
			}

		}

		return ans;

	}
}
