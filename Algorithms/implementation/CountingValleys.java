package core;

import java.util.Scanner;

public class CountingValleys {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int sum = 0, count = 0;
		String s = scanner.next();
		scanner.close();

		char[] levels = s.toCharArray();
		char temp = 0, start = 0;
		for (int i = 0; i < n; i++) {
			temp = levels[i];
			if (i == 0)
				start = temp;
			else if (sum == 0)
				start = temp;
			switch (temp) {
			case 'U':
				sum += 1;
				break;
			case 'D':
				sum -= 1;
				break;
			}
			if (sum == 0) {
				if (start == 'D')
					count++;
			}
		}
		System.out.println(count);
	}
}
