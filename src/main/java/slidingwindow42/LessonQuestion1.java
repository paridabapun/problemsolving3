package slidingwindow42;

/*
 * Given n elements find the max subarray sum of length = k.
 * 
 */
public class LessonQuestion1 {
//First Approach
	public static int maxSubArray(int A[], int k) {
		int n = A.length;
		int s = 0, e = k - 1;
		int max = Integer.MIN_VALUE;
		while (e < n) {
			int sum = 0;
			for (int i = s; i <= k; i++) {
				sum += A[i];
			}
			if (max < sum) {
				max = sum;
			}
			s++;
			e++;

		}
		return max;// O(n2)
		
	}

	// Prefix Sum
	public static int maxSubArray1(int A[], int k) {// (Why as we need to calculate sume of the sub array)
		int n = A.length;

		int pf[] = new int[n];
		pf[0] = A[0];

		// { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
		for (int i = 1; i < n; i++) {
			pf[i] = pf[i - 1] + A[i];
		}
		int s = 1, e = k;
		int max = pf[k - 1];
		while (e < n) {
			int sum = pf[e] - pf[s - 1];
			if (max < sum) {
				max = sum;
			}
			s++;
			e++;

		}
		return max;
	}

	// Sliding Window
	public static int maxSubArray2(int A[], int k) {// (Why as we need to calculate sume of the sub array)
		int n = A.length;

		//
		// SUM of the first SUB ARRAY
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += A[i];

		}// O(k)
		
		
		int ans = sum;
		int s = 1;
		int e = k;
		while (e < n) {//(O(n-k)
			sum = sum - A[s - 1] + A[e];
			if (ans < sum) {
				ans = sum;
			}
			s++;
			e++;
		}
		//O(n),  O(1) SC

		return ans;
	}

	public static void main(String[] args) {

		int arr[] = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };

		int maxArr = maxSubArray2(arr, 5);
		System.out.println(maxArr);

	}

}
