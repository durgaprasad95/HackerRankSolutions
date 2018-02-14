package implementation;

import java.util.Scanner;

public class TaumAndBDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			long[] cost = { b * x + w * y, (b + w) * x + w * z, (b + w) * y + b * z };
			long min = cost[0];
			for (int i = 1; i < 3; i++) {
				if (min > cost[i])
					min = cost[i];
			}
			System.out.println(min);
		}
		in.close();
	}
}
