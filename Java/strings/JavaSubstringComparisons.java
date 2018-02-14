package strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String temp = "";
		int length = s.length();
		for (int i = 0; i <= length - k; i++) {
			if (i == 0) {
				smallest = s.substring(i, i + k);
				largest = s.substring(i, i + k);
			} else {
				temp = s.substring(i, i + k);
				if (temp.compareTo(smallest) < 0)
					smallest = temp;
				if (temp.compareTo(largest) > 0)
					largest = temp;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
