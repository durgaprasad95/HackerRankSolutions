package implementation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu", new Locale("ru"));
		LocalDate localDate = LocalDate.of(year, 1, 1);
		if (year == 1918) {
			localDate = LocalDate.ofYearDay(year, 256).plusDays(13);
		} else if (year < 1918) {
			if (localDate.isLeapYear())
				localDate = LocalDate.ofYearDay(year, 256);
			else {
				if (year % 4 == 0)
					localDate = LocalDate.ofYearDay(year, 255);
				else
					localDate = LocalDate.ofYearDay(year, 256);
			}
		} else
			localDate = LocalDate.ofYearDay(year, 256);
		System.out.println(localDate.atTime(LocalTime.now()).format(dateTimeFormatter));

	}

}
