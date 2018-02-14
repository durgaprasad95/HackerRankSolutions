package implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] cldNat = new int[n];
		for (int i = 0; i < n; i++)
			cldNat[i] = in.nextInt();
		in.close();
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			if (i + 2 <= n - 1 && cldNat[i + 2] == 0)
				i++;
			cnt++;
		}
		System.out.println(cnt);
	}
}
