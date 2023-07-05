package arrayinterviewprob2;

/*
 * 
 * 
 */
public class Assignment4 {

	public static int solve(int[] A) {

		int n = A.length;
		int count = 1;
		int maj = A[0];

		for (int i = 1; i < n; i++) {
			if (count == 0) {
				maj = A[i];
				count = 1;

			} else {
				if (A[i] == maj) {
					count++;

				} else {
					count--;
				}
			}
		}
		
		System.out.println("Majority "+maj);
		System.out.println("Count  "+count);

		int freq = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] == maj) {
				freq++;
			}
		}
		if (freq > n / 2) {
			return maj;
		} else {
			return -1;
		}

	}
	
	public static void main(String[] args) {
		
		int A[]= {1,1,2};
		System.out.println(solve(A));
		
		
	}
}
