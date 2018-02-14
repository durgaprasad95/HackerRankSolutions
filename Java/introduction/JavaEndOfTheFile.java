package introduction;

import java.util.Scanner;

public class JavaEndOfTheFile {

	public static void main(String[] args) {
		int i = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			System.out.println(++i + " " + in.nextLine());
		}
		in.close();
	}
}
