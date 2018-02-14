package introduction;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while (t-- > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			int sum = a;
			for (int i = 0; i < n; i++) {
				sum += Math.pow(2, i) * b;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
