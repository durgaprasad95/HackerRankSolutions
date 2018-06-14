package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class SumSquareDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		BigInteger four = BigInteger.valueOf(4l);
		BigInteger two = BigInteger.valueOf(2l);
		BigInteger one = BigInteger.valueOf(1l);
		BigInteger six = BigInteger.valueOf(6l);
		for (int a0 = 0; a0 < t; a0++) {
			BigInteger n = in.nextBigInteger();
			BigInteger sum = n.multiply(n.add(one)).divide(two).pow(2)
					.subtract(n.multiply(n.add(one)).multiply(two.multiply(n).add(one)).divide(six));
			System.out.println(sum);
		}
		in.close();
	}
}
