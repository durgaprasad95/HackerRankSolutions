package bitManipulation;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		in.close();
		int max = 0;
		for (int i = L; i <= R; i++) {
			for (int j = R; j >= i; j--) {
				if (max < (i ^ j))
					max = i ^ j;
			}
		}
		System.out.println(max);
	}
}
