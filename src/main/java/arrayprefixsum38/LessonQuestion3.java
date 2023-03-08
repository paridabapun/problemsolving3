package arrayprefixsum38;

/*
 * 
 */
public class LessonQuestion3 {

	public int solve(int[] A) {
		int n = A.length;
		int pref[] = new int[A.length];
		pref[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			pref[i] = pref[i - 1] + A[i];
		}
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				if (pref[n - 1] - pref[i] == 0) {
					count++;
				}
			}

			else {
			}
			if (pref[i - 1] == pref[n - 1] - pref[i]) {
				count++;
			}
		}
		return count;

	}
}
