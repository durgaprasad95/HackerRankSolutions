package core;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		if (s.isEmpty() || s.replaceFirst("[ ]+", " ").contentEquals(" "))
			System.out.println(0);
		else {
			String[] temp = s.replaceFirst("^[ !,?._'@]+", "").trim().split("[ !,?._'@]+");
			System.out.println(temp.length);
			for (String x : temp)
				System.out.println(x);
		}
	}

}
