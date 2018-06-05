package implementation;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		long result = 0, n = in.nextLong();
		in.close();
		int length = s.length();
		long simpleCount = s.chars().parallel().sorted().filter(x -> x == 'a').count();
		if (s.equals("a"))
			System.out.println(n);
		else if (s.contains("a")) {
			if (s.indexOf("a") <= n - 1) {
				result += simpleCount * (n / length);
				result += s.chars().limit(n % length).parallel().sorted().filter(x -> x == 'a').count();
				System.out.println(result);
			} else
				System.out.println(0);
		} else
			System.out.println(0);
	}

}
