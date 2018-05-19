package geometry;

import java.util.Scanner;

public class SherlockAndPlanes {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int i, T, p;
		T = num.nextInt();
		while (T > 0) {
			int x[] = new int[4];
			int y[] = new int[4];
			int z[] = new int[4];
			for (i = 0; i < 4; i++) {
				x[i] = num.nextInt();
				y[i] = num.nextInt();
				z[i] = num.nextInt();
			}
			p = (((x[1] - x[0]) * (y[2] - y[0]) - (x[2] - x[0]) * (y[1] - y[0])) * (z[3] - z[0])
					+ ((y[1] - y[0]) * (z[2] - z[0]) - (z[1] - z[0]) * (y[2] - y[0])) * (x[3] - x[0])
					- ((z[2] - z[0]) * (x[1] - x[0]) - (z[1] - z[0]) * (x[2] - x[0])) * (y[3] - y[0]));
			if (p != 0)
				System.out.println("NO");
			else
				System.out.println("YES");

			T--;
		}
		num.close();
	}
}

