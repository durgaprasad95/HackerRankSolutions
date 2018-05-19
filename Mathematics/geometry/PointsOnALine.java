package geometry;

import java.util.Scanner;

public class PointsOnALine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt(), y = in.nextInt();
		boolean xVal = true, yVal = true;
		while (n-- > 1) {
			if (x == in.nextInt()) {
				if (xVal)
					xVal = true;
			} else
				xVal = false;
			if (y == in.nextInt()) {
				if (yVal)
					yVal = true;
			} else
				yVal = false;
		}
		in.close();
		if ((xVal && !yVal) || (yVal && !xVal))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
