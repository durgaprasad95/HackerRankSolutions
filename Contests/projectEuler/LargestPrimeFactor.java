package projectEuler;

import java.util.Arrays;
import java.util.Scanner;

public class LargestPrimeFactor {

	static boolean primeCheck(boolean flag, long num) {
		int factorsCount = 1;
		boolean result = true;
		if (num == 1)
			return false;
		if (num == 2)
			return true;
		for (long i = 3; num != 1 && i <= (long) Math.ceil(Math.sqrt(num)); i = i + 2) {
			if (i % 5 == 0)
				continue;
			if (flag) {
				if (num % i != 0) {
					result = true;
				} else if ((++factorsCount) > 1) {
					return false;
				}
			} else
				return false;
		}
		return result;
	}

	static boolean unitsDigitCheck(long num) {
		if (num == 1 || num == 4)
			return false;
		if (num == 2 || num == 5)
			return true;
		Long[] digits = { 1l, 3l, 7l, 9l };
		if (Arrays.asList(digits).contains(num % 10))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			if (n % 2 == 0) {
				for (long i = n - 1; i > 2; i = i - 2) {
					if (n % i == 0) {
						if (primeCheck(unitsDigitCheck(i), i)) {
							System.out.println(i);
							i = 1;
						}
					}
					if (i == 3)
						System.out.println(2);
				}
			} else {
				for (long i = n; i > 2; i = i - 2) {
					if (n % i == 0) {
						if (primeCheck(unitsDigitCheck(i), i)) {
							System.out.println(i);
							i = 1;
						}
					}
				}
			}
		}
	}
}
