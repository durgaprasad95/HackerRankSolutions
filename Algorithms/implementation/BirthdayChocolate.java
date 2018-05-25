package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int tempSum = 0, count = 0;
		int[] s = new int[n];
		for (int i = 0; i < n; i++)
			s[i] = in.nextInt();
		int sum = in.nextInt();
		int length = in.nextInt();
		in.close();
		for (int skipLength = 0; skipLength <= (n - length); skipLength++) {
			tempSum = Arrays.stream(s).skip(skipLength).limit(length).sum();
			if (tempSum == sum)
				count++;
		}
		System.out.println(count);
	}

}
