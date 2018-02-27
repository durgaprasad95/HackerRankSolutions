package fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class SpecialMultiple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int N = in.nextInt();
			BigInteger x = BigInteger.ONE;
			for (long i = 1;;) {
				BigInteger result = (x.multiply(BigInteger.valueOf(9)));
				if (result.mod(BigInteger.valueOf(N)) == BigInteger.ZERO) {
					System.out.println(result);
					break;
				}
				x = new BigInteger(Long.toBinaryString(++i));
			}
		}
		in.close();
	}

}
