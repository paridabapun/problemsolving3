package slidingwindow42;

/*
 * Given A[n] and a number B . 
 * Find and return minimum of swaps to bring all the numbers <= B together
 * 
 * 
 */
public class LessonQuestion2 {

	int minSwaps(int A[], int B) {

		int n = A.length;
//		NEED to calculate total  element to for the sub Aay

		int k = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] <= B) {
				k++;
			}
		}

		int bad = 0;
		for (int i = 0; i < k; i++) {
			if (A[i] > B) {
				bad++;
			}
		}
		int ans = bad;
		int s = 1;
		int e = k;

		while (e < n) {
			if (A[s - 1] > B) {
				bad--;
			}
			if (A[e] > B) {
				bad++;
			}
			if (ans > bad) {
				ans = bad;
			}
			s++;
			e++;
		}

		return ans;

	}

}
