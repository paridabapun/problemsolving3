package arrayinterviewprob2;

/*
 * 
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */
public class Assignment3 {

	public int solve(int[] A) {
		int n = A.length;

		int pref_even[] = new int[n];

		pref_even[0] = A[0];

		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				pref_even[i] = pref_even[i - 1] + A[i];
			} else {
				pref_even[i] = pref_even[i - 1];
			}
		}
		int pref_odd[] = new int[n];
		pref_odd[0] = 0;

		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				pref_odd[i] = pref_odd[i - 1] + A[i];
			} else {
				pref_odd[i] = pref_odd[i - 1];
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			int even = 0;
			int odd = 0;

			even = pref_odd[n - 1] - pref_odd[i] + (i > 0 ? pref_even[i - 1] : 0);
			odd = pref_even[n - 1] - pref_even[i] + (i > 0 ? pref_odd[i - 1] : 0);
			if (even == odd) {
				count++;
			}

		}
		return count;
	}
}
