package strings;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String x = in.nextLine();
		char[] s = (in.nextLine()).toCharArray();
		int k = in.nextInt();
		k = k % 26;
		in.close();
		String result = "";
		for (int i = 0; i < n; i++) {
			int temp = ((int) s[i] + k);
			if (temp - k <= 122 && temp - k >= 97) {
				if (temp <= 122) {
					s[i] = (char) temp;
				} else {
					s[i] = (char) (temp - 26);
				}
			} else {
				if (temp - k <= 90 && temp - k >= 65) {
					if (temp <= 90) {
						s[i] = (char) temp;
					} else {
						s[i] = (char) (temp - 26);
					}
				}
			}
			result += s[i];
		}
		System.out.println(result);
	}
}
