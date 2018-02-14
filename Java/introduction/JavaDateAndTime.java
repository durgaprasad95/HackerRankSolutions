package introduction;

import java.util.Scanner;

public class JavaDateAndTime {

	static String getDay(String day, String month, String year) {

		int temp = 0, tempYear = Integer.parseInt(year) - 1;
		boolean leap = false;
		String res = null;
		temp = (tempYear / 400) * 0 + ((tempYear % 400) / 300) * 1 + (((tempYear % 400) % 300) / 200) * 3
				+ ((((tempYear % 400) % 300) % 200) / 100) * 5 + (((((tempYear % 400) % 300) % 200) % 100) / 4) * 2
				+ (((((tempYear % 400) % 300) % 200) % 100) - (((((tempYear % 400) % 300) % 200) % 100) / 4));
		if (Integer.parseInt(year) % 400 == 0) {
			leap = true;
		} else if (Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0) {
			leap = true;
		}
		for (int i = 1; i < Integer.parseInt(month); i++) {
			switch (i) {
			case 1:
				temp += 3;
				break;
			case 2:
				if (leap)
					temp += 1;
				else
					temp += 0;
			case 3:
				temp += 3;
			case 4:
				temp += 2;
				break;
			case 5:
				temp += 3;
				break;
			case 6:
				temp += 2;
				break;
			case 7:
				temp += 3;
				break;
			case 8:
				temp += 3;
				break;
			case 9:
				temp += 2;
				break;
			case 10:
				temp += 3;
				break;
			case 11:
				temp += 2;
				break;
			case 12:
				temp += 3;
				break;
			}
		}
		temp += (Integer.parseInt(day));
		switch (temp % 7) {
		case 6:
			res = "SATURDAY";
			break;
		case 0:
			res = "SUNDAY";
			break;
		case 1:
			res = "MONDAY";
			break;
		case 2:
			res = "TUESDAY";
			break;
		case 3:
			res = "WEDNESDAY";
			break;
		case 4:
			res = "THURSDAY";
			break;
		case 5:
			res = "FRIDAY";
			break;
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();
		System.out.println(getDay(day, month, year));
	}
}
