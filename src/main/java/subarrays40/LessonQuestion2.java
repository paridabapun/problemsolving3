package subarrays40;

/*
 * 
 */
//WAP to print all possible subarrays 
public class LessonQuestion2 {

	// BF
	public static void printSubArray(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
//(i,j) (start, end) --> 1 sub array				
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
		// TC - O(N3) SC - O(1)

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 4, 6, 3, 7, 6, 8 };
//		int arr[] = { 2,8,9};
		printSubArray(arr);
	}

}