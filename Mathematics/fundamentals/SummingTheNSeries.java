package fundamentals;

import java.util.Scanner;

public class SummingTheNSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- != 0) {
			long n = in.nextLong();
			if (n > 100000007)
				n = n % 1000000007;
			System.out.println((n * n) % 1000000007);
		}
		in.close();
	}
}
