package fundamentals;

import java.util.Scanner;

public class ConnectingTowns {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int N = in.nextInt();
			long result = 1;
			for (int i = 1; i < N; i++) {
				if (result > 1234567)
					result = result % 1234567;
				result *= in.nextInt();
			}
			System.out.println(result % 1234567);
		}
		in.close();

	}

}
