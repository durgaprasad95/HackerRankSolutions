package Arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] input = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				input[i][j] = in.nextInt();
			}
		}
		in.close();
		int prevSum = input[0][0] + input[0][1] + input[0][2] + input[1][1] + input[2][0] + input[2][1] + input[2][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				prevSum = hourGlassSum(input, prevSum, i, j);
			}
		}
		System.out.println(prevSum);

	}

	private static int hourGlassSum(int[][] input, int prevSum, int i, int j) {
		int sum = input[i][j] + input[i][j + 1] + input[i][j + 2] + input[i + 1][j + 1] + input[i + 2][j]
				+ input[i + 2][j + 1] + input[i + 2][j + 2];
		if (prevSum <= sum)
			return sum;
		else
			return prevSum;
	}
}
