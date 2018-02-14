package implementation;

import java.util.Scanner;

public class Lisa_sWorkbook {

	private static int pagenumber = 1, result = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] totalproblems = new int[n];
		for (int i = 0; i < n; i++)
			totalproblems[i] = in.nextInt();
		in.close();
		for (int i = 0; i < n; i++) {
			int presentproblem = 1, presentpageproblem = 1;
			while (presentproblem <= totalproblems[i]) {
				if (presentpageproblem > k) {
					pagenumber++;
					presentpageproblem = 1;
				}
				if (presentproblem == pagenumber) {
					result++;
				}
				presentproblem++;
				presentpageproblem++;
			}
			pagenumber++;
		}
		System.out.println(result);
	}
}
