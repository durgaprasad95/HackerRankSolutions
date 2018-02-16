package fundamentals;

import java.util.Scanner;

public class StrangeGridAgain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long r = in.nextInt();
		int c = in.nextInt();
		in.close();
		long result = 0;
		if (r % 2 != 0)
			result = ((r - 1) / 2) * 10;
		else
			result = 1 + (((r - 2) / 2) * 10);
		result += (2 * (c - 1));
		System.out.println(result);

	}

}
