package implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] ADs = new int[m];
		int[] ODs = new int[n];
		for (int i = 0; i < m; i++)
			ADs[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			ODs[i] = in.nextInt();
		in.close();
		int Acnt = 0, Ocnt = 0, Amin = s - a, Amax = t - a, Omin = b - t, Omax = b - s;
		for (int i = 0; i < m; i++) {
			if (ADs[i] > 0 && ADs[i] >= Amin && ADs[i] <= Amax)
				Acnt++;
		}
		for (int i = 0; i < n; i++) {
			if (ODs[i] < 0 && -ODs[i] >= Omin && -ODs[i] <= Omax)
				Ocnt++;
		}
		System.out.println(Acnt);
		System.out.println(Ocnt);
	}
}
