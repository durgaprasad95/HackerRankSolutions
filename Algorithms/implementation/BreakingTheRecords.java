package implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] s = new long[n];
		for (int i = 0; i < n; i++)
			s[i] = in.nextLong();
		in.close();
		long high = s[0], low = s[0];
		int high_cnt = 0, low_cnt = 0;
		for (int i = 1; i < n; i++) {
			if (high < s[i]) {
				high = s[i];
				high_cnt++;
			}
			if (low > s[i]) {
				low = s[i];
				low_cnt++;
			}
		}
		System.out.print(high_cnt + " " + low_cnt);
	}
}
