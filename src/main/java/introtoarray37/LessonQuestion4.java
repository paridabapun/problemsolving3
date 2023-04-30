package introtoarray37;

//Given an array ofsize n reverse the elements in [S , E]using constant extra  space.

// 0 <= S <=E<=n-1
public class LessonQuestion4 {

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
