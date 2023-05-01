package subarrays40;

/*
 * 
 */
//WAP to find the sum of sum of all sub array
public class LessonQuestion4 {

	// Optimised to O(n2)
	public static int sumSubArray(int arr[]) {

		int n = arr.length;
		int total = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {

				// (i,j) (start, end) --> 1 sub array
				sum += arr[j]; // carry forward the ans
				total += sum;
			}
		}
		// TC - O(N2) SC - O(1)
		return total;

	}

	public static void main(String[] args) {

//		int arr[] = { 1, 4, 3, 4, 6, 3, 7, 6, 8 };
		int arr[] = { 2, 8, 9 };
		int sumArr = sumSubArray(arr);
		System.out.println(sumArr);

	}

}