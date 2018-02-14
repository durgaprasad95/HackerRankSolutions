package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.toUpperCase();
		in.close();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			al.add((Integer) (int) s.charAt(i));
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 65; i <= 90; i++)
			res.add((Integer) i);
		if (al.containsAll(res))
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
