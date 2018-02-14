package implementation;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		int[] total = { 0, 0, 0, 0, 0 };
		int id = 1, temp = 1, max = total[0];
		for (int types_i = 0; types_i < n; types_i++) {
			types[types_i] = in.nextInt();
			switch (types[types_i]) {
			case 1:
				total[0]++;
				break;
			case 2:
				total[1]++;
				break;
			case 3:
				total[2]++;
				break;
			case 4:
				total[3]++;
				break;
			case 5:
				total[4]++;
				break;
			}
		}
		in.close();
		for (int i = 1; i < 5; i++) {
			if (max >= total[i]) {
				temp = i;
				if (id > temp)
					id = temp;
			} else {
				max = total[i];
				id = i + 1;
			}
		}
		System.out.println(id);
	}
}
