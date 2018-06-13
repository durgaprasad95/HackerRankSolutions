package core;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
	}

}

class MyRegex {

	String pattern = "(([0-1]?[0-9]{1,2})?(2?[0-5]{1,2})?)[.](([0-1]?[0-9]{1,2})?(2?[0-5]{1,2})?)[.](([0-1]?[0-9]{1,2})?(2?[0-5]{1,2})?)[.](([0-1]?[0-9]{1,2})?(2?[0-5]{1,2})?)";
}