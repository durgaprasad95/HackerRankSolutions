package fundamentals;

import java.util.Scanner;

public class BusStation {

	/*
	 * SAMPLE INPUT: 8 1 2 1 1 1 2 1 3 OUPUT: 3 4 6 12
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n + 1];
		int[] sum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			if (i == 1)
				sum[i] = a[1];
			else
				sum[i] = sum[i - 1] + a[i];
		}
		in.close();
		int tempSum = 0;
		for (int i = 1; i <= n; i++) {
			tempSum = 0;
			if (sum[n] % sum[i] == 0) {
				for (int j = 1; j <= n; j++) {
					if (tempSum <= sum[i]) {
						tempSum += a[j];
						if (tempSum == sum[i]) {
							tempSum = 0;
							if (j == n)
								System.out.printf(sum[i] + " ");
						} else {
							if (tempSum > sum[i]) {
								j = n + 1;
							}
						}
					}
				}
			}
		}
	}
}
