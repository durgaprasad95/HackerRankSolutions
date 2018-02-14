package bitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {

	private static int lonelyInteger(int[] a) {
		int res = 0, len = a.length;
		if (len == 1)
			res = a[0];
		else {
			Arrays.sort(a);
			for (int i = 1; i < len; i = i + 2) {
				if (a[i - 1] != a[i]) {
					res = a[i - 1];
					break;
				} else if (i == (len - 2))
					res = a[len - 1];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
		in.close();
	}
}
