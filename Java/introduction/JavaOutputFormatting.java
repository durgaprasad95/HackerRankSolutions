package introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			int k = 15 - s1.length();
			System.out.printf("%s", s1);
			for (int j = 1; j <= k; j++)
				System.out.printf(" ");
			if ((x / 10) == 0) {
				System.out.println("00" + x);
			} else {
				if ((x / 100) == 0)
					System.out.println("0" + x);
				else
					System.out.println(x);
			}
		}
		System.out.println("================================");
		sc.close();
	}
}
