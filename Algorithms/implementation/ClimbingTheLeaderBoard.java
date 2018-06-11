package core;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ClimbingTheLeaderBoard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] rankScores = new int[n];
		for (int i = 1; i <= n; i++) {
			rankScores[i - 1] = in.nextInt();
		}
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int i = 1; i <= m; i++) {
			alice[i - 1] = in.nextInt();
		}
		int[] array = IntStream.of(rankScores).distinct().toArray();
		int i = array.length - 1;
		for (int score : alice) {
			while (i >= 0) {
				if (score >= array[i])
					i--;
				else {
					System.out.println(i + 2);
					break;
				}
			}
			if (i < 0)
				System.out.println(1);
		}
		in.close();
	}

}
