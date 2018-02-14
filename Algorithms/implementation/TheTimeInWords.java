package implementation;

import java.util.Scanner;

public class TheTimeInWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		in.close();
		if (M == 1)
			System.out.println(inswitch(M) + " minute past " + inswitch(H));
		else {
			if (M == 15)
				System.out.println("quarter past " + inswitch(H));
			else {
				if (M == 0)
					System.out.println(inswitch(H) + " o' clock");
				else {
					if (M < 30)
						System.out.println(inswitch(M) + " minutes past " + inswitch(H));
					else {
						if (M == 30)
							System.out.println("half past " + inswitch(H));
						else {
							if (M == 45)
								System.out.println("quarter to " + inswitch(H + 1));
							else {
								if (M == 59)
									System.out.println(inswitch(60 - M) + " minute to " + inswitch(H + 1));
								else {
									System.out.println(inswitch(60 - M) + " minutes to " + inswitch(H + 1));
								}
							}
						}
					}
				}
			}
		}
	}

	private static String inswitch(int x) {
		String s = "";
		switch (x) {
		case 1:
			s = "one";
			break;
		case 2:
			s = "two";
			break;
		case 3:
			s = "three";
			break;
		case 4:
			s = "four";
			break;
		case 5:
			s = "five";
			break;
		case 6:
			s = "six";
			break;
		case 7:
			s = "seven";
			break;
		case 8:
			s = "eight";
			break;
		case 9:
			s = "nine";
			break;
		case 10:
			s = "ten";
			break;
		case 11:
			s = "eleven";
			break;
		case 12:
			s = "twelve";
			break;
		case 13:
			s = "thirteen";
			break;
		case 14:
			s = "fourteen";
			break;
		case 15:
			s = "fifteen";
			break;
		case 16:
			s = "sixteen";
			break;
		case 17:
			s = "seventeen";
			break;
		case 18:
			s = "eighteen";
			break;
		case 19:
			s = "nineteen";
			break;
		case 20:
			s = "twenty";
			break;
		case 21:
			s = "twenty one";
			break;
		case 22:
			s = "twenty two";
			break;
		case 23:
			s = "twenty three";
			break;
		case 24:
			s = "twenty four";
			break;
		case 25:
			s = "twenty five";
			break;
		case 26:
			s = "twenty six";
			break;
		case 27:
			s = "twenty seven";
			break;
		case 28:
			s = "twenty eight";
			break;
		case 29:
			s = "twenty nine";
			break;
		}
		return s;
	}
}
