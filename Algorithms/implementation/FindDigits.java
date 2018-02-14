package implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int T;
		T = num.nextInt();
		while (T-- > 0) {
			long N, b, c, x = 0;
			int t = 0;
			N = num.nextLong();
			b = N;
			c = N;
			while (b != 0) {
				b /= 10;
				;
				t++;
			}
			long[] a = new long[t];
			for (int i = 0; i < t; i++) {
				a[i] = c % 10;
				c /= 10;
			}
			for (int i = 0; i < t; i++) {
				if (a[i] != 0)
					if (N % a[i] == 0)
						x++;
			}
			System.out.println(x);
		}
		num.close();
	}
}
