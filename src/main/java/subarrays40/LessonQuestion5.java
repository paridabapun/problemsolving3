package subarrays40;

/*
 * 
 */
//WAP to find the sum of sum of all sub array
public class LessonQuestion5 {

	// Optimised to O(n)
	public static int sumSubArray(int arr[]) {

		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {

			// (i,j) (start, end) --> 1 sub array
			sum += arr[i] * (i + 1) * (n - i);
			
			//(i + 1) * (n - i); no subarrays , so now multiply it with element
		}
		// TC - O(N2) SC - O(1)
		return sum;

	}

	public static void main(String[] args) {

//		int arr[] = { 1, 4, 3, 4, 6, 3, 7, 6, 8 };
		int arr[] = { 2, 8, 9 };
		int sumArr = sumSubArray(arr);
		System.out.println(sumArr);

	}

}