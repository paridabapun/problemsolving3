package carryforward39;

/*
 * Given an array find the no of leaders,Leader :=> An element that is greater then all the
elements on its left side */
public class LessonQuestion3 {

	public static int noOFLeaders(int arr[]) {
		int n = arr.length;
		int maxLeft = arr[0];
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > maxLeft) {
				count++;
				maxLeft=arr[i];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 4, 17, 16 };
		int n = noOFLeaders(arr);
		System.out.println(n);
	}

}
