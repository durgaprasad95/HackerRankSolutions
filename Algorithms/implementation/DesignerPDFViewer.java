package implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 26;
		int h[] = new int[n];
		for (int h_i = 0; h_i < n; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		in.close();
		int max = 0, len = word.length();
		for (int i = 0; i < len; i++) {
			int present = h[((int) word.charAt(i)) - 97];
			if (max < present)
				max = present;
		}
		System.out.println(len * max);
	}
}
