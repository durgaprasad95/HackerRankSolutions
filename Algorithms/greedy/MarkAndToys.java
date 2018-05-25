package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		long tempSum = 0;
		int[] prices = new int[n];
		for (int i = 0; i < n; i++)
			prices[i] = in.nextInt();
		Arrays.sort(prices);
		for (int i = 0; i < n; i++) {
			tempSum += prices[i];
			if (tempSum <= k)
				count++;
			else
				break;
		}
		System.out.println(count);
		in.close();
	}

}
