package implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int likeSum = Math.floorDiv(5, 2), dayLike = likeSum;
		for (int i = 2; i <= n; i++) {
			dayLike = Math.floorDiv((dayLike * 3), 2);
			likeSum += dayLike;
		}
		System.out.println(likeSum);
	}
}
