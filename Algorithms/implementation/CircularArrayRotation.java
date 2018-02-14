package implementation;

import java.util.Scanner;

public class CircularArrayRotation {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n, k, q;
		n = in.nextInt();
		k = in.nextInt();
		q = in.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		int[] array = new int[n];
		if (k >= n)
			k %= n;
		int x = n - k, y = 0;
		for (int i = 0; i < n; i++) {
			if (i < k)
				array[i] = numbers[x++];
			else
				array[i] = numbers[y++];
		}
		while (q-- > 0) {
			int index = in.nextInt();
			System.out.println(array[index]);
		}
		in.close();

	}
}
