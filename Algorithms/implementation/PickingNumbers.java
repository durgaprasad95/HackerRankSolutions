package core;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = scanner.nextLine();
		scanner.close();
		int[] a = new int[n];
		String[] aItems = s.split(" ");
		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		Arrays.sort(a);
		int start = a[0], size = 0, maxSize = size, startIndex = 1;
		for (int i = startIndex; i < n; i++) {
			if (a[i] - start <= 1) {
				size++;
			} else {
				start = a[startIndex];
				i = startIndex;
				startIndex = startIndex + 1;
				if (maxSize < size) {
					maxSize = size;
				}
				size = 0;
			}
		}
		if (maxSize < size) {
			maxSize = size;
		}
		System.out.println(maxSize + 1);

	}
}
