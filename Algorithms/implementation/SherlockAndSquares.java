package implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println((int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1));
		}
		in.close();
	}

}
