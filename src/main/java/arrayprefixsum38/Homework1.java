package arrayprefixsum38;

/*
 * 
 * Q4. Product array puzzle

Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
Constraints

2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]
 */
public class Homework1 {
	public static int[] solve(int[] A) {

		// using modulus
		int n = A.length;
		int mul = 1;
		for (int i = 0; i < n; i++) {
			mul *= A[i];
		}

		for (int i = 0; i < n; i++) {
			A[i] = mul / A[i];
		}

		return A;

	}

	public static int[] solve1(int[] A) {

		// using pref & suffix
		int n = A.length;

		// Calculate PREFIX
		int pref[] = new int[n];
		pref[0] = A[0];

		for (int i = 1; i < n; i++) {
			pref[i] = pref[i - 1] + A[i];
		}

		// CALCULATE SUFFIX (REVERSE of PREFIX )
		int suff[] = new int[n];
		suff[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suff[i] = suff[i + 1] * A[i];
		}

		int arr[] = new int[n];

		arr[0] = suff[1];
		arr[n - 1] = pref[n - 2];

		for (int i = 1; i < n - 1; i++) {
			arr[i] = pref[i - 1] * suff[i + 1];
		}

		return A;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int farr[] = solve(arr);

		for (int i = 0; i < farr.length; i++) {
			System.out.print(farr[i] + " ");
		}

		// FOR SECOND method
		int sArr[] = { 1, 2, 3, 4, 5 };
		solve1(sArr);

	}
}
