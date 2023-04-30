package introtoarray37;

//Reverse an array of size n using constant extra space	 space
public class LessonQuestion3 {

	 public int[] solve(final int[] A) {

	        int l =0;
	        int r =A.length-1;

	        while(l < r){

	            int temp =A[l];
	            A[l] = A[r];
	            A[r] = temp;
	            l++;
	            r--;

	        }
	        return A;
	    }
	}
