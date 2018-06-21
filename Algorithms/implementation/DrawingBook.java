package core;

import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

	static int pageCount(int n, int p) {
		int result = 0;
		if (n % 2 == 0) {
			if (p % 2 == 0) {
				result = Math.min((1 + p / 2), (1 + (n - p) / 2));
			} else {
				result = Math.min(1 + (p - 1) / 2, 1 + (n + 1 - p) / 2);
			}
		} else {
			if (p % 2 == 0) {
				result = Math.min((1 + p / 2), (1 + (n - 1 - p) / 2));
			} else {
				result = Math.min(1 + (p - 1) / 2, 1 + (n - p) / 2);
			}
		}
		return result - 1;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		int p = scanner.nextInt();

		int result = pageCount(n, p);

		System.out.println(result);

		scanner.close();
	}

}
