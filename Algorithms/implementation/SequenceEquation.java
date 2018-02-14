package implementation;

import java.util.Scanner;

public class SequenceEquation {

	private static int cnt = 0, ans = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] pofn = new int[n];
		// i means p inverse of n
		for (int i = 0; i < n; i++)
			pofn[i] = in.nextInt();
		in.close();
		for (int i = 1; i <= n; i++) {
			System.out.println(findy(pofn, n, i));
		}
	}

	private static int findy(int[] pofn, int n, int x) {
		cnt++;
		for (int j = 0; j < n; j++) {
			if (pofn[j] == x) {
				if (cnt == 2) {
					ans = j + 1;
					cnt = 0;
					break;
				} else
					findy(pofn, n, j + 1);
			}
		}
		return ans;
	}
}
