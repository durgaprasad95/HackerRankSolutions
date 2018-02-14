package implementation;

import java.util.Scanner;

public class BeautifulMoviesAtTheMovies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		in.close();
		int cnt = 0;
		for (int x = i; x <= j; x++) {
			String s = "";
			int pre = x;
			while (pre != 0) {
				s = s + Integer.toString(pre % 10);
				pre /= 10;
			}
			int revnum = Integer.parseInt(s);
			if (Math.abs(x - revnum) % k == 0)
				cnt++;
		}
		System.out.println(cnt);
	}
}
