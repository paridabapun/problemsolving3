package arrayprefixsum38;

/*
 * GIVEN n element , q querire . Each queries --> [l,r]. Fin d the count of all the even numbers in the range [l,r]
 */
public class LessonQuestion3 {

	public int[] countEven(int[] A, int q) {
		int n = A.length;
		int pcount[] = new int[n];

		if (A[0] % 2 == 0) {
			pcount[0] = 1;
		} else {
			pcount[0] = 0;
		}

		for (int i = 1; i < n; i++) {
			if (A[i] % 2 == 0) {
				pcount[i] = 1 + pcount[i - 1];
			} else {
				pcount[i] = pcount[i - 1];
			}
		}

		int ans[] = new int[q];
		for (int i = 0; i < q; i++) {
			//  - Input need to be taken
			int l = 0;
			int r = 0;
			//  END
			if (l == 0) {
				ans[i] = pcount[r];
			} else {
				ans[i] = pcount[r] - pcount[l - 1];
			}

		}
		return ans;

	}
}
