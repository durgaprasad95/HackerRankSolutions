package fundamentals;

import java.util.Scanner;

public class MaximumDraws {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int T;
		T = num.nextInt();
		while (T-- > 0) {
			int N;
			N = num.nextInt();
			System.out.println(N + 1);
		}
		num.close();
	}

}
