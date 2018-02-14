package strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();
		char[] s = S.toCharArray();
		int len = S.length();
		int cnt = 0;
		for (int i = 0; i < len - 2; i += 3) {
			if (s[i] != 'S')
				cnt++;
			if (s[i + 1] != 'O')
				cnt++;
			if (s[i + 2] != 'S')
				cnt++;
		}
		System.out.println(cnt);
	}
}
