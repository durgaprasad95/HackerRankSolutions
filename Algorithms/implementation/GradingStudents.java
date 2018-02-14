package implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			if (grade >= 38 && (5 - grade % 5) < 3) {
				grade += 5 - grade % 5;
				System.out.println(grade);
			} else
				System.out.println(grade);
		}
	}
}
