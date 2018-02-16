package fundamentals;

import java.util.Scanner;

public class DiwaliLights {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int N = in.nextInt();
			long result = 1;
			for (int i = 1; i <= N; i++) {
				if (result > 100000)
					result = result % 100000;
				result *= 2;
			}
			System.out.println((result - 1) % 100000);
		}
		in.close();
	}
}
