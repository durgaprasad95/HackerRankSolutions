package bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		BigInteger a = num.nextBigInteger();
		BigInteger b = num.nextBigInteger();
		num.close();
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
