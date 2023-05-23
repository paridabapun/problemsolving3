package arrayinterviewprob1;

/*
 * 	There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.

 * 
 * 
 * 
 */
public class LessonQuestion4 {

	public static int solve(int A) {
		int nearestPow = 1;
		for (int i = 1; Math.pow(2, i) <= A; i++) {

			nearestPow = (int) Math.pow(2, i);
		}
		

		return 1 + (A - nearestPow) * 2;

	}

	public static void main(String[] args) {
		System.out.println(solve(100));
	}
}