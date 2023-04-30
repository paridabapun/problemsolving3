package introtoarray37;

//Rotate an array in clockwise direction by k places (K < n) { Amazon Microsoft Adobe Ola, Directs}

//BruteFORCE 

public class LessonQuestion5 {

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		int[] newArr = new int[n];

		// Copy the last k elements to the beginning of the new array
		for (int i = 0; i < k; i++) {
			newArr[i] = arr[n - k + i];
		}

		// Copy the remaining elements to the end of the new array
		for (int i = k; i < n; i++) {
			newArr[i] = arr[i - k];
		}

		// Assign the new array to the original array
		for (int i = 0; i < n; i++) {
			arr[i] = newArr[i];
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 5, 6, 8, 9, 4 };
		
		rotateArray(arr, 2);
		
		for(int i =0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
