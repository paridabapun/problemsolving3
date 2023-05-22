package arrayinterviewprob1;

/*
 * GIVEN an array of 0S and 1S , We can swap  one of the zero s with a 1 . Return the count of maximum consecutive 1's in the array .
 * 
 */
public class LessonQuestion2 {

	public int solve(int A[]) {

		int n = A.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] == 1) {
				count++;
			}
		}
		if (count == n) {
			return n;
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {

			if (A[i] == 0) {
				int l = 0;
				int j = i - 1;

				while (j > 0 && A[j] == 1) {
					l++;
					j--;
				}

				int r = 0;
				j = i + 1;

				while (j < n && A[j] == 1) {
					r++;
					j++;
				}
				if (l + r + 1 > ans) {
					ans = l + r + 1;
				}
			}

		}

		return 1;
	}
}
