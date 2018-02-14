package fundamentals;

import java.util.Scanner;

public class SherlockAndMovingTiles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double L = in.nextDouble();
		double S1 = in.nextDouble();
		double S2 = in.nextDouble();
		double Q = in.nextDouble();
		double ans = 0.0;
		while (Q-- != 0) {

			if (S2 > S1)
				ans = ((double) Math.sqrt(2) * (L - Math.sqrt(in.nextDouble()))) / (S2 - S1);
			else
				ans = ((double) Math.sqrt(2) * (L - Math.sqrt(in.nextDouble()))) / (S1 - S2);

			System.out.println(ans);
		}
		in.close();
	}
}
