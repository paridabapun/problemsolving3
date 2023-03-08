package introductiontoproblemsolving34;

public class LessonQuestion2 {

	static int primeNumber(int A) {

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

	}
}
