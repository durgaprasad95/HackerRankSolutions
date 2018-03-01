package combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class NCRTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int n = in.nextInt();
			BigInteger[] storage = {};
			int r = 0;
			if (n % 2 == 0) {
				storage = new BigInteger[(n / 2) + 1];
				storage[0] = BigInteger.ONE;
				System.out.print(storage[0] + " ");
				for (int i = 1; i <= (n / 2); i++) {
					r = i - 1;
					storage[i] = storage[r].multiply(BigInteger.valueOf(n - r)).divide(BigInteger.valueOf(r + 1));
					System.out.print(storage[i].mod(BigInteger.valueOf(1000000000)) + " ");
				}
				for (int i = (n / 2) - 1; i >= 0; i--)
					System.out.print(storage[i].mod(BigInteger.valueOf(1000000000)) + " ");

			} else {
				storage = new BigInteger[(n + 1) / 2];
				storage[0] = BigInteger.ONE;
				System.out.print(storage[0] + " ");
				for (int i = 1; i <= ((n - 1) / 2); i++) {
					r = i - 1;
					storage[i] = storage[r].multiply(BigInteger.valueOf(n - r)).divide(BigInteger.valueOf(r + 1));
					System.out.print(storage[i].mod(BigInteger.valueOf(1000000000)) + " ");
				}
				for (int i = ((n - 1) / 2); i >= 0; i--)
					System.out.print(storage[i].mod(BigInteger.valueOf(1000000000)) + " ");
			}
			System.out.println("");
		}
		in.close();
	}

}
