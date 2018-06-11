package core;

import java.util.Scanner;

public class HackerrankInAString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		String x = in.nextLine();
		char[] result = { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
		while (q > 0) {
			String s = in.nextLine();
			char[] sc = s.toCharArray();
			int length = sc.length, index = 0;
			for (int i = 0; i < length; i++) {
				if (result[index] == sc[i])
					index++;
				if (index == 10) {
					System.out.println("YES");
					break;
				} else {
					if (i == (length - 1))
						System.out.println("NO");
				}
			}
			q--;
		}
		in.close();
	}

}
