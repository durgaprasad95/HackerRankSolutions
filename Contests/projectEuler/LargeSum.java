package projectEuler;

import java.util.Scanner;

public class LargeSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String empty = in.nextLine();
		String[] numbers = new String[N];
		for (int i = 0; i < N; i++)
			numbers[i] = in.nextLine();
		in.close();
		long sum = 0;
		for (int i = 40, j = 50; j >= 10; i -= 10) {
			for (int k = 0; k < N; k++) {
				sum += Long.parseLong(numbers[k].substring(i, j));
			}
			if (i > 0) {
				if (sum % Math.pow(10, 10) > 0)
					sum = (long) (sum / Math.pow(10, 10));
				else
					sum = 0;
			}
			j -= 10;
		}
		String result = "" + sum;
		System.out.println(result.substring(0, 10));
	}

}
