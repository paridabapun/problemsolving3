package carryforward39;

/*
 * GIVEN a string of lowercase letters , return the count of(i , j) s.t i <j, s[i] ='a' s[j] = 'g' 
 * 
 */
public class LessonQuestion1 {

	int countPairs(char s[], int n) {

		int count = 0;
		int ans = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'a') {
				count++;
			} else if (s[i] == 'g') {
				ans += count;
			}
		}

		return ans;
	}

}
