package fundamentals;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int l, b, T, p, q = 0;
		T = num.nextInt();
		while (T-- > 0) {
			l = num.nextInt();
			b = num.nextInt();
			if (l == b)
				System.out.println(1);
			if (l != b) {
				q = l > b ? b : l;
				int min = -1;
				for (p = 1; p <= q; p++)
					if (l % p == 0 && b % p == 0)
						if (min > (l * b) / (p * p) || min == -1)
							min = (l * b) / (p * p);

				System.out.println(min);
			}
		}
		num.close();
	}
}
