package strings;

import java.util.Scanner;

public class JavaStringIntoduction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		in.close();
		int alen = A.length();
		int blen = B.length();
		System.out.println(alen + blen);
		if (A.compareTo(B) > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println((char) ((int) A.charAt(0) - 32) + A.substring(1, alen) + " "
				+ (char) ((int) B.charAt(0) - 32) + B.substring(1, blen));
	}
}
