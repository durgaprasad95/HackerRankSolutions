package projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prime_10001st {

	static boolean primeCheck(boolean flag, int num) {
		int factorsCount = 1;
		boolean result = true;
		if (num == 1)
			return false;
		if (num == 2)
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

	public static void main(String[] ars) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		Scanner in = new Scanner(System.in);
		for (int i = 11; i <= 1000000; i = i + 2) {
			if (primeCheck(unitsDigitCheck(i), i))
				primes.add(i);
		}
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int N = in.nextInt();
			System.out.println(primes.get(N - 1));
		}
		in.close();
	}
}
