package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[101];
		Arrays.fill(arr, 0);
		while (n-- > 0) {
			arr[in.nextInt()] += 1;
		}
		in.close();
		Arrays.sort(arr);
		int deletions = Arrays.stream(arr).limit(100).filter(x -> x != 0).sum();
		System.out.println(deletions);
	}

}
