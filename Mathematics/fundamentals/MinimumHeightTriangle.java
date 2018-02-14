package fundamentals;

import java.util.Scanner;

public class MinimumHeightTriangle {

	static int lowestTriangle(int base, int area) {
		return (int) Math.ceil(2 * (double) area / base);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int area = in.nextInt();
		int height = lowestTriangle(base, area);
		System.out.println(height);
		in.close();
	}
}
