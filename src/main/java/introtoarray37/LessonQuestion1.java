package introtoarray37;


//GIVEN an array of n elements, find the no of elements in the array such that the array has atleast one element that is greater than it.

public class LessonQuestion1 {

	public int solve(int[] A) {
		
		int max = A[0];
		
		for(int i =1;i <A.length;i++) {
			if(A[i] > max) {
				max=A[i];
			}
		}
		
		int count =0;
		for(int i =0; i < A.length;i++) {
			if(max != A[i]) {
				count++;
			}
		}
		return count;
	}
}
