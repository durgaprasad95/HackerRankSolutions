package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	private static int H;
	private static int B;
	private static boolean flag;
	static {
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		B = in.nextInt();
		in.close();
		if (H > 0 && B > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}
}
