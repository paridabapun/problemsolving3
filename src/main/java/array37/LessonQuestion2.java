package array37;

//7Given an array of size n and an integer k. Return True if there exists a fair (i j) s t(such that) ar[i] + ar[j] == k and i not eqal to j , else return false

public class LessonQuestion2 {

	public boolean solve(int[] A, int B) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				if (A[i] + A[j] == B) {
					return true;
				}
			}
		}
		return false;
	}
}
