package carryforward39;

/*
 * Given an array return the length of smallest subarray
which contains both the min and men of the array.
 */
public class LessonQuestion2 {

	public static int smallestSubArray(int A[]) {
		int n = A.length;
		int min = getMin(A);
		int max = getMax(A);

		System.out.println(max + " " + min);

		int lastMin = -1;
		int lastMax = -1;
		int ans = n;
		for (int i = 0; i < n; i++) {

			if (A[i] == min) {
				lastMin = i;
				if (lastMax != -1) {// I got the min now , behind this min is there any max present  ? 
					if (i - lastMax + 1 < ans) {
						ans = i - lastMax + 1;
					}
				}
			}

			if (A[i] == max) {
				lastMax = i;
				if (lastMin != -1) {
					if (i - lastMin + 1 < ans) {
						ans = i - lastMin + 1;
					}
				}
			}

		}

		return ans;

	}

	public static int getMax(int A[]) {
		int n = A.length;
		int max = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}

		return max;

	}

	public static int getMin(int A[]) {
		int n = A.length;
		int min = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 1, 5, 4, 2, 6, 9 };
		int ans = smallestSubArray(arr);
		System.out.println(ans);

	}
}
