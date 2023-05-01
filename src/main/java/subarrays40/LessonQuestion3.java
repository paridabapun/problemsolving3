package subarrays40;

/*
 * 
 */
//WAP to find the sum of each possible sub array
public class LessonQuestion3 {

	// BF
	public static int[] sumSubArray(int arr[]) {

		int n = arr.length;
		int ans[] = new int[(n * (n + 1)) / 2];
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
//(i,j) (start, end) --> 1 sub array				
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				ans[c] = sum;
				c++;
			}
		}
		// TC - O(N3) SC - O(1)
		return ans;

	}
	
	// Optimised to O(n2)
		public static int[] sumSubArray1(int arr[]) {

			int n = arr.length;
			int ans[] = new int[(n * (n + 1)) / 2];
			int c = 0;
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					
	//(i,j) (start, end) --> 1 sub array				
					sum+=arr[j]; // carry forward the ans
					ans[c] = sum;
					c++;
				}
			}
			// TC - O(N2) SC - O(n2)
			return ans;

		}

	public static void main(String[] args) {

//		int arr[] = { 1, 4, 3, 4, 6, 3, 7, 6, 8 };
		int arr[] = { 2, 8, 9 };
		int sumArr[] = sumSubArray1(arr);
 
		for (int i = 0; i < sumArr.length; i++) {
			System.out.print(sumArr[i] + " ");
		}
	}

}