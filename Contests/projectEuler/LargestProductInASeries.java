package projectEuler;

import java.util.Scanner;

public class LargestProductInASeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
			int K = in.nextInt();
			String empty = in.nextLine();
			String number = in.nextLine();
			int length = number.length();
			char[] digits = number.toCharArray();
			int result = -1, temp = 1;
			for (int i = 0, j = 0; i < K; i++) {
				if (j >= length - K)
					break;
				temp *= Integer.parseInt("" + digits[j + i]);
				if (i == K - 1) {
					if (temp > result) {
						result = temp;
					}
					j++;
					temp = 1;
					i = -1;
				}
			}
			System.out.println(result);
		}
		in.close();

	}

}
