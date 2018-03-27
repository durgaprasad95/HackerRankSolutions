package numberTheory;

import java.util.Scanner;

public class ConstructingANumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- != 0) {
			int n = in.nextInt();
			long sum = 0;
			while (n-- != 0) {
				sum += in.nextInt();
			}
			if (sum % 3 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		in.close();

	}

}
