package implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int[] width = new int[N];
		for (int i = 0; i < N; i++)
			width[i] = in.nextInt();
		while (T-- > 0) {
			int entry = in.nextInt();
			int exit = in.nextInt();
			int minwidth = width[entry];
			for (int i = entry + 1; i <= exit; i++) {
				if (minwidth >= width[i])
					minwidth = width[i];
			}
			System.out.println(minwidth);
		}
		in.close();
	}
}
