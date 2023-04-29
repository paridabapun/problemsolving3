package introductiontoproblemsolving34;

public class LessonQuestion2 {

	static int factors(int A) {

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

	static boolean isPrime(int x) {

		int n = factors(x);

		if (n == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isPrime(5));

	}
}
