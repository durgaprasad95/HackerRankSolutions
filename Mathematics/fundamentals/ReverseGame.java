package fundamentals;

import java.util.Scanner;

public class ReverseGame {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int T = num.nextInt();
		while (T-- != 0) {
			int N = num.nextInt();
			int k = num.nextInt();
			if (N % 2 != 0) {
				if (k == N / 2) {
					System.out.println(N - 1);
					N = 0;
				}
			}
			int count = 0;
			for (int i = 1; i <= N / 2; i++) {
				if ((N - i) == k) {
					System.out.println(count);
					break;
				} else
					count++;
				if ((i - 1) == k) {
					System.out.println(count);
					break;
				} else
					count++;
			}
		}
		num.close();
	}
}