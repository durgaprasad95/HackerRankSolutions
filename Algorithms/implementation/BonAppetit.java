package implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sum = 0;
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			cost[i] = in.nextInt();
			sum += cost[i];
		}
		int charge = in.nextInt();
		in.close();
		if (charge == (int) (sum - cost[k]) / 2)
			System.out.println("Bon Appetit");
		else
			System.out.println((int) cost[k] / 2);
	}
}
