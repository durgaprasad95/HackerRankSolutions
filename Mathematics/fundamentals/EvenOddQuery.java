package fundamentals;

import java.util.Scanner;

public class EvenOddQuery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++)
			A[i] = in.nextInt();
		int Q = in.nextInt();
		while (Q-- != 0) {
			int x = in.nextInt();
			int y = in.nextInt();
			if (x > y)
				System.out.println("Odd");
			if (A[x] % 2 == 0 && ((x == y) || (A[x + 1] != 0)))
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		in.close();
	}

}
