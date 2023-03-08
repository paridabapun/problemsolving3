package timecomplexityone35;

public class TC10 {

	public void fun1(int N) {

		for (int i = 1; i <= N; i++) {

			for (int j = 1; j <= N; j++) {
				System.out.println(i + j);

			}

			System.out.println(i);

		}
	}

}

// TC --  iteration is N^2