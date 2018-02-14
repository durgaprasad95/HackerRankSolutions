package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();
		Arrays.sort(c);
		int cnt = 0, max = (int) (n / 2);
		for (int i = 0; i < n - 1; i++) {
			if (c[i] == c[i + 1]) {
				cnt++;
				++i;
			}
			if (cnt == max)
				break;
		}
		System.out.println(cnt);
	}
}
