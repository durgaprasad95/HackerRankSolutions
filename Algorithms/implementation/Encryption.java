package implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		String fs = "";
		int R = 0, C = 0, cnt = 0, length = s.length();
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) != ' ') {
				fs = fs + s.charAt(i);
			} else
				cnt++;
		}
		length -= cnt;
		int area = (int) Math.pow((int) Math.ceil(Math.sqrt(length)), 2);
		for (int i = (int) Math.floor(Math.sqrt(length)); i <= (int) Math.ceil(Math.sqrt(length)); i++) {
			for (int j = (int) Math.floor(Math.sqrt(length)); j <= (int) Math.ceil(Math.sqrt(length)); j++) {
				if (i <= j && (i * j) >= length) {
					if (area >= i * j) {
						R = i;
						C = j;

					}
				}
			}
		}
		char[][] c = new char[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (length <= 0) {
					c[i][j] = ' ';
				} else {
					c[i][j] = fs.charAt(i * C + j);
					length--;
				}
			}
		}
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				if (c[j][i] != ' ')
					System.out.print(c[j][i]);
			}
			System.out.print(" ");
		}
	}
}
