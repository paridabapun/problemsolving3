	package arrayinterviewprob1;
/*
 * Q2. Length of longest consecutive ones


Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 */
public class Assignment2 {

	  public int solve(String A) {
		 	char arr[] = A.toCharArray();

				int len = arr.length;

				int count = 0;
				for (int i = 0; i < len; i++) {
					if (arr[i] == '1') {

						count++;
					}
				}
				if (count == len) {
					return len;
				}

				int ans = 0;

				for (int i = 0; i < len; i++) {
					if (arr[i] == '0') {
						int l = 0;
						int j = i - 1;
						while (j >= 0 && arr[j] == '1') {
							l++;
							j--;
						}
		                            
						int r = 0;
						j = i + 1;
						while (j < len && arr[j] =='1' ) {
							r++;
							j++;
						}
		                if(r+l == count){
		                    return count;
		                }

						if (r + l + 1 > ans) {
							ans = r + l + 1;
						}

		                // if(r+l == count){
		                //     return count;
		                // }
		                // else{
		                //     ans=Math.max(ans,r+l+1);
		                // }
					}
				}
		        // System.out.println(ans);
				return ans;
			}

		}
