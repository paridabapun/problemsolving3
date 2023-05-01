package subarrays40;

/*
 * 
 */
//WAP to print SubArrays 
public class LessonQuestion1 {

	// PRINT THE SUBARRAY IF THE START AND END GIVEN
	static void printSubArrays(int arr[], int start, int end) {

		int n = arr.length;
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static int sumSubArrays(int arr[], int start, int end) {

		int n = arr.length;
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}
		return sum;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 4, 6, 3, 7, 6, 8 };
		printSubArrays(arr, 2, 4);
		System.out.println();
		System.out.println("The sum of sub array "+sumSubArrays(arr, 2, 4));

	}
}
