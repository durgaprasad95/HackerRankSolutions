package core;

import java.util.Scanner;

public class StrongPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String x = in.nextLine();
		String s = in.nextLine();
		int count = 4;
		boolean first = false, second = false, third = false, fourth = false;
		in.close();
		char[] chars = s.toCharArray();
		if (n < 3)
			System.out.println(6 - n);
		else {
			for (char character : chars) {
				if (!first && (int) character < 58 && (int) character > 47) {
					first = true;
					count -= 1;
				} else if (!second && (int) character < 123 && (int) character > 96) {
					second = true;
					count -= 1;
				} else if (!third && (int) character < 91 && (int) character > 64) {
					third = true;
					count -= 1;
				} else if (!fourth && (int) character < 46 && (int) character > 32) {
					fourth = true;
					count -= 1;
				}
				if (count == 0) {
					System.out.println((6 > n ? Math.max(count, 6 - n) : count));
					break;
				}
			}
			if (count != 0)
				System.out.println((6 > n ? Math.max(count, 6 - n) : count));
		}
	}

}
