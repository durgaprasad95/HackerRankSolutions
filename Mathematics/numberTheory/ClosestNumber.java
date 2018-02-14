package numberTheory;

import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int a, b, x, T;
		T = num.nextInt();
		while (T-- > 0) {
			a = num.nextInt();
			b = num.nextInt();
			x = num.nextInt();
			if ((b < 0 || a == 1 || b == 0) && x != 1)
				System.out.println(0);
			else {
				if (x == 1 || ((int) Math.pow(a, b) % x == 0))
					System.out.println((int) Math.pow(a, b));
				else {
					int m;
					int r = (int) Math.pow(a, b);
					m = (int) (r / x);
					if ((r > m * x) && r < (m + 1) * x)
						System.out.println(r - m * x <= (m + 1) * x - r ? m * x : (m + 1) * x);
				}
			}
		}
		num.close();
	}
}
