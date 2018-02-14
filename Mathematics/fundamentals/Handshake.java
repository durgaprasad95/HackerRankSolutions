package fundamentals;

import java.util.Scanner;

public class Handshake {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int T, N;
		T = num.nextInt();
		while (T-- > 0) {
			N = num.nextInt();
			System.out.println(N * (N - 1) / 2);
		}
		num.close();
	}
}
