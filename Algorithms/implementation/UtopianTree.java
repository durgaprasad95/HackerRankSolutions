package implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int T, x;
		T = num.nextInt();
		while (T-- > 0) {
			int N;
			N = num.nextInt();
			if (N % 2 == 0) {
				x = cycle(N);
				System.out.println(x);
			}
			if (N % 2 != 0) {
				x = cycle(N + 1);
				System.out.println(x - 1);
			}
		}
		num.close();
	}

	public static int cycle(int N) {
		int x = 1;
		while (N > 1) {
			x = (x * 2) + 1;
			N -= 2;
		}
		return x;
	}
}
