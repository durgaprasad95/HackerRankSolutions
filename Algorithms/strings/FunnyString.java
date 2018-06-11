package strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String empty = in.nextLine();
		while (t-- > 0) {
			StringBuilder reverse = new StringBuilder(in.nextLine());
			String straight = reverse.toString();
			reverse.reverse().toString();
			int length = reverse.length();
			int diff1 = 0, diff2 = 0;
			for (int i = 1; i < length; i++) {
				diff1 = Math.abs((int) straight.charAt(i) - (int) straight.charAt(i - 1));
				diff2 = Math.abs((int) reverse.charAt(i) - (int) reverse.charAt(i - 1));
				if (diff1 != diff2) {
					System.out.println("Not Funny");
					break;
				}
				if (i == length - 1)
					System.out.println("Funny");
			}
		}
		in.close();
	}

}
