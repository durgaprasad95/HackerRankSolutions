package warm_Up;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int N;
		N = num.nextInt();
		for (int p = 1; p <= N; p++) {
			for (int i = 1; i <= N - p; i++)
				System.out.print(" ");
			for (int q = N - p + 1; q <= N; q++)
				System.out.print("#");
			System.out.println();
		}
	}
}
