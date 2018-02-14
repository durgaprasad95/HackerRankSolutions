package sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int n, V;
		V = num.nextInt();
		n = num.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = num.nextInt();
		loop: for (int i = 0; i < n; i++) {
			if (ar[i] == V) {
				System.out.println(i);
				break loop;
			}
		}
	}
}
