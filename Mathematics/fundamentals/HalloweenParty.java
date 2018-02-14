package fundamentals;

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			long k = in.nextLong();
			long x = (long) (k / 2);
			System.out.println(x * (k - x));
		}
		in.close();
	}
}
