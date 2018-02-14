package warm_Up;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int N, x = 0, y = 0;
		N = num.nextInt();
		int[][] p = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				p[i][j] = num.nextInt();
		}
		num.close();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)
					x += p[i][j];
			}
		}
		int i = 0, j = N;
		while (i < N) {
			j--;
			y += p[i][j];
			i++;
		}
		System.out.println((x - y) < 0 ? (y - x) : (x - y));
	}
}
