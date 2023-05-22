package arrayinterviewprob1;

public class Assignment2 {

	public int solve(String A) {

		char arr[] = A.toCharArray();

		int len = arr.length;

		int count = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 1) {

				count++;
			}
		}
		if (count == len) {
			return len;
		}

		int ans = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				int l = 0;
				int j = i - 1;
				while (j >= 0 && arr[j] == 1) {
					l++;
					j--;
				}

				int r = 0;
				j = i + 1;
				while (j < 0 && arr[j] == 1) {
					r++;
					;
					j++;
				}
				if (r + l + 1 > ans) {
					ans = r + l + 1;
				}
			}
		}
		return ans;
	}

}
