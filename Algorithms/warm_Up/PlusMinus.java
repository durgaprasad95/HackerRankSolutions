package warm_Up;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int N;
		N = num.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = num.nextInt();
		}
		float a = 0, b = 0, c = 0;
		for (int i = 0; i < N; i++) {
			int x = p[i] * (-1);
			if (x > 0)
				a++;
			if (x < 0)
				b++;
			if (x == 0)
				c++;

		}
		System.out.printf("%s", toString(b / N, a / N, c / N));
	}

	public static String toString(float b, float a, float c) {
		return String.format("%.03f\n%.03f\n%.03f", b, a, c);
	}
}
