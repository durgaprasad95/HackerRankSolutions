package fundamentals;

import java.util.Scanner;

public class SherlockAndDivisors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int N = in.nextInt();
			if (N % 2 != 0)
				System.out.println(0);
			else {
				int count = 0;
				for (int i = 1; i <= (int) Math.sqrt(N); i++) {
					if (N % i == 0) {
						if (i % 2 == 0)
							++count;
						int x = (N / i);
						if (x != i && x % 2 == 0)
							++count;
					}
				}
				System.out.println(count);
			}
		}
		in.close();
	}
}
