package core;

import java.util.Scanner;

public class ProjectEuler183 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] result = new long[1000000];
		for (int i = 5; i <= 1000000; i++) {
			result[i - 1] = result[i - 2] + productMax(i);
		}
		int q = in.nextInt();
		while (q-- > 0) {
			int n = in.nextInt();
			System.out.println(result[n - 1]);
		}
		in.close();
	}

	private static long productMax(int N) {
		long result = 0, maxParts = (long) Math.round((float) N / Math.E);
		maxParts = (N % maxParts) == 0 ? 1 : (maxParts / gcd(N, maxParts));
		result = isTerminating(maxParts) ? -N : N;
		return result;
	}

	private static boolean isTerminating(long maxParts) {
		long temp = maxParts;
		while (temp >= 1) {
			if (temp == 1)
				return true;
			else {
				if (temp % 10 == 0)
					temp = temp / 10;
				else if (temp % 5 == 0)
					temp /= 5;
				else if (temp % 2 == 0)
					temp /= 2;
				else
					return false;
			}
		}
		return false;
	}

	private static long gcd(int a, long b) {
		long min = Math.min(a, b), max = Math.max(a, b), gcd = 1;
		while (true) {
			if (max % min == 0) {
				gcd = min;
				max = gcd;
				return gcd;
			} else {
				gcd = max % min;
				max = min;
				min = gcd;
			}
		}
	}

}