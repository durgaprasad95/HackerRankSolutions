package algebra;

import java.util.Scanner;

public class SteppingStonesGame {

	public static void main(String[] args) {

		double i, T, N;
		int p;
		Scanner num = new Scanner(System.in);
		T = num.nextDouble();
		while (T-- > 0) {
			N = num.nextDouble();
			i = (-1 + Math.sqrt(1 + 8 * N)) / 2;
			p = (int) i;
			if (p == i)
				System.out.println("Go On Bob" + " " + p);
			else
				System.out.println("Better Luck Next Time");
		}
		num.close();
	}
}
