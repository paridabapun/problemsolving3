package introductiontoproblemsolving34;
// WAP check if the number is perfect square or not ? 

public class LessonQuestion3 {

	// Bruteforce

	public static int sqrt(int n) {

		for (int i = 1; i < n; i++) {
			if (i * i == n) {
				return i;
			}
		}

		return -1;

	}

//	Optimise
	public static int sqrt1(int n) {

		int i = 1;
		int ans = 0;
		while (i * i <= n) {
			ans = i;
			if (i * i == n) {
				return ans;
			}
			i++;
		}

		return -1;

	}

	public static void main(String[] args) {

		int n = sqrt(25);
		System.out.println(n);

		int n1 = sqrt1(25);
		System.out.println(n1);

	}

}