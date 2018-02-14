package warm_Up;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int N;
		long x = 0;
		N = num.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = num.nextInt();
			x += p[i];
		}
		num.close();
		System.out.println(x);
	}
}
