package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	static Scanner in = new Scanner(System.in);
	static int N = in.nextInt();
	static int priVal = N;

	public static void main(String[] args) {

		int[] StkLens = new int[N];
		for (int i = 0; i < N; i++)
			StkLens[i] = in.nextInt();
		in.close();
		int cnt = 1;
		System.out.println(N);
		Arrays.sort(StkLens);
		for (int i = 1; i < N; i++) {
			if (StkLens[i] == StkLens[i - 1])
				cnt++;
			else {
				priVal -= cnt;
				System.out.println(priVal);
				cnt = 1;
			}
		}
	}
}
