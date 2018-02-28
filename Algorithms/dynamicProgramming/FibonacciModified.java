package dynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t1 = in.nextInt();
		int t2 = in.nextInt();
		int n = in.nextInt();
		BigInteger result = fibonacciModified(t1, t2, n);
		System.out.println(result);
		in.close();
	}

	private static BigInteger fibonacciModified(int t1, int t2, int n) {
		BigInteger[] storage = new BigInteger[n + 1];
		storage[1] = BigInteger.valueOf(t1);
		storage[2] = BigInteger.valueOf(t2);
		for (int i = 3; i <= n ; i++) {
			storage[i] = storage[i - 2].add(storage[i - 1].pow(2));
		}
		return storage[n];
	}

}
