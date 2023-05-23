	package arrayinterviewprob1;
/*
 * Q3. Q4. Josephus Problem - 2





There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.



Problem Constraints
1 <= A <= 105


Input Format
First argument A is an integer.


Output Format
Return an integer.


Example Input
Input 1:
A = 4
Input 2:
A = 5


Example Output
Output 1:
1
Output 2:
3


Example Explanation
For Input 1:
Firstly, the person at position 2 is killed, then the person at position 4 is killed,
then the person at position 3 is killed. So the person at position 1 survives. 
For Input 2:
 
Firstly, the person at position 2 is killed, then the person at position 4 is killed, 
then the person at position 1 is killed. Finally, the person at position 5 is killed. 
So the person at position 3 survives. 


 */
public class Assignment4 {

	 public int solve(int  A) {


     	int nearestPow = 1;
		for (int i = 1; Math.pow(2, i) <= A; i++) {

			nearestPow = (int) Math.pow(2, i);
		}
		

		return 1 + (A - nearestPow) * 2;

	}
}