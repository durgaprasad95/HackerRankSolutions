package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[100];
		Arrays.fill(arr, 0);
		while (n-- > 0) {
			arr[in.nextInt()] += 1;
		}
		for (int i = 0; i < 100; i++) {
			if (arr[i] != 0) {
				while (arr[i]-- > 0)
					System.out.print(i + " ");
			}
		}
		in.close();
	}

}
