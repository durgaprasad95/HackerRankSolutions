package fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class SherlockAndPermutations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- != 0) {
			int N = in.nextInt();
			int M = in.nextInt();
			int temp = M + N - 1;
			BigInteger result = BigInteger.ONE;
			if ((M - 1) >= N) {
				for (int i = temp; i >= M; i--)
					result = result.multiply(BigInteger.valueOf(i));
				result = result.divide(factorial(N));
				System.out.println(result.mod(BigInteger.valueOf(1000000007)));
			} else {
				for (int i = temp; i > N; i--)
					result = result.multiply(BigInteger.valueOf(i));
				result = result.divide(factorial(M - 1));
				System.out.println(result.mod(BigInteger.valueOf(1000000007)));
			}
		}
		in.close();

	}

	private static BigInteger factorial(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = num; i >= 2; i--)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}
}