package introductiontoproblemsolving34;

/*
 * Count of factors
 * 
 * 
 */
public class LessonQuestion1 {

	// BruteForce method :
	static int countFactors(int A) {

		int count = 0;
		for (int i = 1; i <= A; i++) {
			if (A % i == 0) {
				count++;
			}

		}

		return count;
	}

	// Optimised
	static int countFactors1(int A) {

		int count = 0;

		for (int i = 1; i * i <= A; i++) {

			if (A % i == 0) {
				if (i == A / i) {
					count++;
				} else {
					count += 2;
				}
			}

		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(countFactors(124));
		System.out.println(countFactors1(124));
	}
}
