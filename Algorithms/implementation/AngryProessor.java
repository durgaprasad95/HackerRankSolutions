package implementation;

import java.util.Scanner;

public class AngryProessor {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int T;
		T = num.nextInt();
		while (T-- > 0) {
			int N, K, t = 0;
			N = num.nextInt();
			K = num.nextInt();
			int[] a = new int[N];
			for (int i = 1; i <= N; i++)
				a[i - 1] = num.nextInt();
			for (int i = 1; i <= N; i++) {
				if (a[i - 1] <= 0)
					t++;
			}
			if (K <= t)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		num.close();
	}
}
