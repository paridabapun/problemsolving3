package arrayinterviewprob1;

/*
 * Given an array count  the number of triplets.(i,j,k) st i < j < k. and arr[i]<arr[j]< arr[k]
 * 
 * 
 * 
 */
public class LessonQuestion3 {

//	Brute FORCE O(n3)
	public static int solve(int[] A) {

		int n = A.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (A[i] < A[j] && A[j] < A[k]) {
						count++;
					}
				}
			}
		}

		return count;

	}

	public static int solve1(int[] A) {

		int n = A.length;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int l = 0;
			for (int j = 0; j < i; j++) {
				if (A[j] < A[i]) {
					l++;
				}
			}
			int r = 0;
			for (int j = i + 1; j < n; j++) {
				if (A[j] > A[i]) {
					r++;
				}
			}
			ans += l * r;

		}

		return ans;

	}

	public static void main(String[] args) {
		int A[] = { 2, 6, 9, 4, 10 };
		System.out.println(solve1(A));

	}

}