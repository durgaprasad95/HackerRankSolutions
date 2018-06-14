package projectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
			System.out.println(BigInteger.valueOf(2l).pow(N).toString().chars()
					.mapToLong(x -> Integer.parseInt("" + (char) x)).sum());
		}
		in.close();
	}

}
