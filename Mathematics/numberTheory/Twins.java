package numberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	static boolean primeCheck(boolean flag, int num) {
		int factorsCount = 1;
		boolean result = true;
		if (!flag)
			return false;
		if (num == 2 || num == 5)
			return true;
		for (int i = 3; num != 1 && i <= (int) Math.ceil(Math.sqrt(num)); i = i + 2) {
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

	static boolean unitsDigitCheck(int num) {
		if (num == 1 || num == 4)
			return false;
		if (num == 2 || num == 5)
			return true;
		Integer[] digits = { 1, 3, 7, 9 };
		if (Arrays.asList(digits).contains(num % 10))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int result = 0, previousPrime = 0, presentPrime = 0;
		for (int i = n; i <= m; i++) {
			if (primeCheck(unitsDigitCheck(i), i)) {
				presentPrime = i;
				if ((previousPrime != 0) && ((presentPrime - previousPrime) == 2)) {
					result++;
				}
				previousPrime = presentPrime;
			}
		}
		System.out.println(result);
	}

}
