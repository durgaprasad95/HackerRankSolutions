package projectEuler;

import java.util.Scanner;

public class SmallestMultiple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
			long result = 1;
			for (int i = 2; i <= N; i++) {
				if (result % i == 0)
					continue;
				else {
					result = varMultiple(i, result);
				}
			}
			System.out.println(result);
		}
		in.close();

	}

	private static long varMultiple(int N, long result) {
		for (int i = N - 1; i >= Math.ceil(Math.sqrt(N)); i--) {
			if (N % i == 0) {
				return (result * N / i);
			}
		}
		return result * N;
	}
}
