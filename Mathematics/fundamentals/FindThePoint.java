package fundamentals;

import java.util.Scanner;

public class FindThePoint {

	public static void main(String[] args) {

		int i, T, Px, Py, Qx, Qy, Rx, Ry;
		Scanner num = new Scanner(System.in);
		T = num.nextInt();
		for (i = 1; i <= T; i++) {
			Px = num.nextInt();
			Py = num.nextInt();
			Qx = num.nextInt();
			Qy = num.nextInt();
			Rx = 2 * Qx - Px;
			Ry = 2 * Qy - Py;
			System.out.println(Rx + " " + Ry);
		}
		num.close();
	}
}
