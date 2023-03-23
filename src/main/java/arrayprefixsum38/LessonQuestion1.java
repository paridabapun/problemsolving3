package arrayprefixsum38;

/*
 * Given n array elements , q queries , for the ith queries , calculate sum of all the elements in the range [li, ri]
 */
public class LessonQuestion1 {

	static void rangeQueries(int arr[], int n, int q) {

		int pref[] = new int[n];
		pref[0] = arr[0];

		for (int i = 1; i < n; i++) {
			pref[i] = pref[i - 1] + arr[i];
		}

		for (int i = 0; i < q; i++) {
			int l = 3;
			int r = 7;
			if (l == r) {
				System.out.println(pref[r]);
			} else {
				System.out.println(pref[r] - pref[l - 1]);
			}
		}

	}

}
