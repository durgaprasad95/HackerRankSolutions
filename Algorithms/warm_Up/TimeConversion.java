package warm_Up;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		String x, mm, hh;
		mm = num.nextLine();
		hh = mm.substring(0, 2);
		x = mm.substring(2, 8);
		if (mm.contains("AM")) {
			System.out.println(hh.equals("12") ? ("00" + x) : (hh + x));
		} else {
			byte[] y = hh.getBytes();
			y[0] += 1;
			y[1] += 2;
			if (y[1] > 57) {
				y[0] += 1;
				y[1] -= 10;
			}
			String zz = new String(y);

			System.out.println(hh.equals("12") ? ("12" + x) : (zz + x));
		}
		num.close();

	}

}
