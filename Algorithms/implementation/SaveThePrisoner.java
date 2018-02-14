package implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			long n = in.nextInt();
			long m = in.nextInt();
			long s = in.nextInt();
			long saveid = 0;
			if (m > n)
				m = mval(m, n);
			if (m + s <= n + 1)
				saveid = m + s - 1;
			else
				saveid = m + s - n - 1;
			System.out.println(saveid != 0 ? saveid : n);
		}
		in.close();
	}

	private static long mval(long m, long n) {
		m = m % n;
		if (m > n)
			m = mval(m, n);
		return m;
	}
}
