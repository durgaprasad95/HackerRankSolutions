package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int facLength = in.nextInt();
		int mulLength = in.nextInt();
		int[] factors = new int[facLength];
		long[] multiples = new long[mulLength];
		for (int i = 0; i < facLength; i++)
			factors[i] = in.nextInt();
		for (int i = 0; i < mulLength; i++)
			multiples[i] = in.nextInt();
		in.close();
		int count = 0;
		Arrays.sort(factors);
		Arrays.sort(multiples);
		long gcd = gcd(multiples, mulLength);
		System.out.println(gcd);
		long lcm = lcm(factors, facLength);
		System.out.println(lcm);
		for (long i = lcm; i <= gcd; i += lcm) {
			if (gcd % i == 0)
				count += 1;
		}
		System.out.println(count);
	}

	private static long gcd(long[] multiples, int mulLength) {
		if (mulLength > 1) {
			long gcd = -1, start = multiples[mulLength - 1];
			for (int i = mulLength - 2; i >= 0; i--) {
				long temp = multiples[i];
				while (true)
					if (start % temp == 0) {
						gcd = temp;
						start = gcd;
						break;
					} else {
						gcd = start % temp;
						start = temp;
						temp = gcd;
					}
				if (gcd == 1)
					return 1;
			}
			return gcd;
		} else
			return multiples[0];
	}

	private static long lcm(int[] factors, int facLength) {
		long ans = factors[0];
		if (facLength > 1) {
			long gcd = 0;
			long[] temp = new long[2];
			for (int i = 1; i < facLength; i++) {
				temp[0] = ans;
				temp[1] = factors[i];
				gcd = gcd(temp, 2);
				ans = (ans * factors[i]) / gcd;
			}
			return ans;
		} else
			return ans;
	}

}
