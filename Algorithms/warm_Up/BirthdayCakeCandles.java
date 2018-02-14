package warm_Up;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		in.close();
		int cnt = 1;
		Arrays.sort(height);
		for (int i = n - 2; i >= 0; i--) {
			if (height[i] == height[n - 1])
				cnt++;
			else
				break;
		}
		System.out.println(cnt);
	}
}
