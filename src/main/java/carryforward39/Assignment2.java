package carryforward39;
/*
 * Q3. Leaders in an array
 * Problem Description
Problem Description

Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.

Problem Constraints

1 <= N <= 105
1 <= A[i] <= 108
Input Format

There is a single input argument which a integer array A
Output Format

Return an integer array denoting all the **leader elements** of the array.
NOTE: Ordering in the output doesn't matter.

Example Input

 A = [16, 17, 4, 3, 5, 2]
Example Output

 [17, 2, 5]
Example Explanation

 Element 17 is strictly greater than all the elements on the right side to it.
 Element 2 is strictly greater than all the elements on the right side to it.
 Element 5 is strictly greater than all the elements on the right side to it.
 So we will return this three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering
 */
public class Assignment2 {
	public int[] solve(int[] A) {
		int n = A.length;
		int count = 1;
		int maxright = A[n - 1];

		for (int i = n - 2; i >= 0; i--) {

			if (A[i] > maxright) {
				count++;
				maxright = A[i];
			}
		}
		int countArray[] = new int[count];

		maxright = A[n - 1];
		int index = 0;
		countArray[index] = A[n - 1];
		index++;
		for (int i = n - 2; i >= 0; i--) {

			if (A[i] > maxright) {

				countArray[index] = A[i];
				maxright = A[i];
				index++;
			}
		}

		return countArray;
	}
}
