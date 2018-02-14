package implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		in.close();
		double time = (double) (x1 - x2) / (double) (v2 - v1);
		if (time > 0 && time % 1 == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
