package introductiontoproblemsolving34;
/*
 * 
 * Q2. Count of primes

Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3


Input Format
Single input parameter n in function.


Output Format
Return the count of prime numbers less than or equal to n.


Example Input
Input 1: 19
Input 2: 1


Example Output
Output 1: 8
Output 2: 0


Example Explanation
Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2: There are no primes <= 1
 */
public class Homework2 {

	int count = 2;

	int primeCount =0;

	for(
	int i = 2;i<=A;i++)
	{
		count = 0;
		for (int j = 1; j <= A; j++) {

			if (i % j == 0) {
				count++;
			}

		}
		if (count == 2) {
			primeCount++;
		}
	}return primeCount;
}}
