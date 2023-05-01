package carryforward39;

/*
 *Q3. Amazing Subarrays

 * 
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 */
public class Homework2 {
	public static int solve(String A) {
		char arr[] = A.toCharArray();
		int n = A.length();
		int sum = 0;
		// TC - O(n)
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
				sum += (n - i); // REFER SM of SUBARRAY last problem of note
		}

		return sum;
	}

//BF O(n2)
	public static int solve1(String A) {
		char arr[] = A.toCharArray();
		int n = A.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {

				if (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u' || arr[j] == 'A'
						|| arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U') {
					count++;

				}

			}

		}

		return count;
	}

	public static void main(String[] args) {
		int n = solve1("Amazon");
		System.out.println(n);
	}

}
