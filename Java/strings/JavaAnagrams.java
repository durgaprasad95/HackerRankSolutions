package core;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaAnagrams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {
		if (a.equals(b))
			return true;
		else {
			Map<Character, Integer> temp1 = new TreeMap<>();
			a.toLowerCase().chars().forEach(x -> {
				temp1.put((char) x, (int) a.toLowerCase().chars().filter(y -> y == x).count());
			});
			Map<Character, Integer> temp2 = new TreeMap<>();
			b.toLowerCase().chars().forEach(x -> {
				temp2.put((char) x, (int) b.toLowerCase().chars().filter(y -> y == x).count());
			});
			if (temp1.equals(temp2))
				return true;
			else
				return false;
		}
	}

}
