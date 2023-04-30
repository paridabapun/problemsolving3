package introtoarray37;

//Rotate an array in clockwise direction by k places (K < n) { Amazon Microsoft Adobe Ola, Directs}

//OPTIMISE CODE
public class LessonQuestion6 {
	public static int[] solve(int[] A, int B) {

		int n = A.length;
		B = B % n;
		reverse(A, n, 0, n - 1);
		reverse(A, n, 0, B - 1);
		reverse(A, n, B, n - 1);

		return A;

	}

	public static int[] reverse(int A[], int n, int s, int e) {

		int l = s;
		int r = e;

		while (l < r) {

			int temp = A[l];
			A[l] = A[r];
			A[r] = temp;
			l++;
			r--;
		}
		return A;
	}
}
