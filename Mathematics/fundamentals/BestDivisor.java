package fundamentals;

import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int sum = 1, bestnum = 1;
		for (int i = 1; i <= Math.sqrt((int) n); i++) {
			if (n % i == 0) {
				if (sum(i) > sum) {
					sum = sum(i);
					bestnum = i;
				} else if (sum(i) == sum && i < bestnum)
					bestnum = i;
				int p = n / i;
				if (sum(p) > sum) {
					sum = sum(p);
					bestnum = p;
				} else if (sum(p) == sum && p < bestnum)
					bestnum = p;
			}
		}
		System.out.println(bestnum);
	}

	private static int sum(int i) {
		if (i != 0)
			return i % 10 + sum(i / 10);
		else
			return 0;
	}
}
