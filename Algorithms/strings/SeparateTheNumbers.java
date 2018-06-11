package strings;

import java.math.BigInteger;
import java.util.Scanner;

public class SeparateTheNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		String empty = in.nextLine();
		while (q-- > 0) {
			String s = in.nextLine();
			int length = s.length(), count = 0;
			BigInteger temp = BigInteger.ZERO, start = BigInteger.valueOf(-1l), previousStart = BigInteger.valueOf(-2l);
			boolean flag = true;
			if (length > 1) {
				for (int i = 0, j = 1;;) {
					temp = new BigInteger(s.substring(i, j + i));
					if (i == 0)
						count = j;
					if (start.equals(BigInteger.valueOf(-1l)))
						start = temp;
					if (previousStart == temp) {
						System.out.println("NO");
						break;
					}
					if (i + j >= length && flag) {
						System.out.println("YES " + start);
						break;
					} else if (i + j >= length && !flag) {
						System.out.println("NO");
						break;
					}
					if ((s.substring(j + i, length)).matches("^" + (temp.add(BigInteger.valueOf(1l))) + ".*")) {
						i += j;
						j = ("" + (temp.add(BigInteger.valueOf(1l))) + "").length();
						flag = true;
					} else {
						flag = false;
						previousStart = start;
						start = BigInteger.valueOf(-1l);
						i = 0;
						j = count + 1;
					}
				}
			} else
				System.out.println("NO");
		}
		in.close();
	}

}
