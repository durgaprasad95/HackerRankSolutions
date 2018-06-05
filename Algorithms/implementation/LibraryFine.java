package implementation;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalDate returnedDate = null;
		LocalDate actualDate = null;
		for (int i = 1; i < 3; i++) {
			int day = in.nextInt();
			int month = in.nextInt();
			int year = in.nextInt();
			if (i == 1)
				returnedDate = LocalDate.of(year, month, day);
			else
				actualDate = LocalDate.of(year, month, day);
		}
		in.close();
		if (returnedDate.isBefore(actualDate) || returnedDate.isEqual(actualDate))
			System.out.println(0);
		else {
			if (returnedDate.getYear() == actualDate.getYear()) {
				if (returnedDate.getMonth() == actualDate.getMonth())
					System.out.println(15 * (returnedDate.getDayOfMonth() - actualDate.getDayOfMonth()));
				else
					System.out.println(500 * (returnedDate.getMonthValue() - actualDate.getMonthValue()));
			} else
				System.out.println(10000);
		}
	}

}
