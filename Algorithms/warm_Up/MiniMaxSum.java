package warm_Up;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] numbers = new long[5];
		for (int i = 0; i < 5; i++) {
			numbers[i] = in.nextLong();
		}
		in.close();
		Arrays.sort(numbers);
		long sum = numbers[1] + numbers[2] + numbers[3];
		System.out.println((numbers[0] + sum) + " " + (numbers[4] + sum));
	}
}
