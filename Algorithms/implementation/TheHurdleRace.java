package implementation;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		int beverages = 0;
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > k) {
				beverages += height[height_i] - k;
				k = height[height_i];
			}
		}
		in.close();
		System.out.println(beverages);
	}
}
