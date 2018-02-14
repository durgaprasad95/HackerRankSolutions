package implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		BigInteger N;
		N = num.nextBigInteger();
		BigInteger p = BigInteger.ONE;
		while (!N.equals(BigInteger.ZERO)) {
			p = p.multiply(N);
			N = N.subtract(BigInteger.ONE);
		}
		System.out.println(p);
		num.close();
	}
}
