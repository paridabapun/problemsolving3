package timecomplexityone35;

import java.util.Scanner;

public class Txtx {

	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 2 * (N - i); j >= 0; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
		}

	}
}
