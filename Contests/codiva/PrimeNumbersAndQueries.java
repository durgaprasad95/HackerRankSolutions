package codiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeNumbersAndQueries {
	static int maxDifference(int startVal, int endVal) {
		if (startVal == endVal)
			return 0;
		int a = 0, b = 0;
		for (int i = startVal; i <= endVal; i++) {
			if (primeCheck(unitsDigitCheck(i), i)) {
				a = i;
				break;
			}
		}
		if (a == 0)
			return 0;
		for (int i = endVal; i >= a; i--) {
			if (primeCheck(unitsDigitCheck(i), i)) {
				b = i;
				break;
			}
		}
		return b - a;
	}

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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine().trim());
		for (int a0 = 0; a0 < q; a0++) {
			String str = br.readLine();
			String input[] = str.split(" ");
			int startVal = Integer.parseInt(input[0]);
			int endVal = Integer.parseInt(input[1]);
			int result = maxDifference(startVal, endVal);
			System.out.println(result);
		}
	}
}
