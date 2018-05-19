package geometry;

import java.util.Scanner;

public class RectangularGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long value = 0;
		long initialX = in.nextLong(), initialY = in.nextLong();
		value = 1;
		while (N-- != 1) {
			long x = in.nextLong();
			long y = in.nextLong();
			if (initialX <= x && initialY <= y) {
				value += 1;
			} else {
				if (initialX <= x && initialY > y) {
					initialY = y;
					value += 1;
				}
				if (initialY <= y && initialX > x) {
					initialX = x;
					value += 1;
				}
				if (initialY > y && initialX > x) {
					initialY = y;
					initialX = x;
					value += 1;
				}
			}
		}
		System.out.println(initialX * initialY);
		in.close();
	}

}
