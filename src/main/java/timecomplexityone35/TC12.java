package timecomplexityone35;

public class TC12 {

	public void fun1(int N) {

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.println(i + j);

			}

			System.out.println(i);

		}
	}

}

//TC --  iteration is n(n+1)/2  O(N^2)