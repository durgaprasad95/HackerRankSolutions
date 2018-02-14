package week_Of_Code_36;

import java.util.Scanner;

public class AcidNaming {

	static String acidNaming(String acid_name) {
		String temp = acid_name;
		if (temp.substring(temp.length() - 2, temp.length()).equals("ic")) {
			if (temp.length() >= 5 && temp.substring(0, 5).equals("hydro"))
				return "non-metal acid";
			else
				return "polyatomic acid";
		} else
			return "not an acid";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String acid_name = in.next();
			String result = acidNaming(acid_name);
			System.out.println(result);
		}
		in.close();
	}
}
