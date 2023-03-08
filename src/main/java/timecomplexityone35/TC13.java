package timecomplexityone35;

public class TC13 {

	public void fun1(int N) {

		for (int i = N; i > 0; i = i / 2) {

			for (int j = 1; j <= i; j++) {
				System.out.println(i + j);

			}

			System.out.println(i);

		}
	}

}

//TC --  iteration is