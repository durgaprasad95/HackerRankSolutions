package fundamentals;

import java.util.Scanner;

public class IsFibo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			long N = in.nextLong();
			for (long i = 0, j = 1, k = 0;;) {
				k = i + j;
				if (k == N) {
					System.out.println("IsFibo");
					break;
				}
				if (k > N) {
					System.out.println("IsNotFibo");
					break;
				}
				i = j;
				j = k;
			}
		}
		in.close();
	}

}
