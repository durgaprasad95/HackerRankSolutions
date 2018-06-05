package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int keyboardMax = 0, mouseMax = 0, finalResult = 0;
		int[] keyboard = new int[n];
		for (int i = 0; i < n; i++) {
			keyboard[i] = in.nextInt();
			keyboardMax = Math.max(keyboardMax, keyboard[i]);
		}
		int[] mouse = new int[m];
		for (int i = 0; i < m; i++) {
			mouse[i] = in.nextInt();
			mouseMax = Math.max(mouseMax, mouse[i]);
		}
		in.close();
		Arrays.sort(keyboard);
		Arrays.sort(mouse);
		if (keyboard[0] + mouse[0] > b)
			System.out.println(-1);
		else {
			int temp = 0, flag = 0;
			if (keyboardMax >= mouseMax) {
				for (int i = n - 1; i >= 0; i--) {
					for (int j = 0; j < m; j++) {
						temp = keyboard[i] + mouse[j];
						if (temp <= b) {
							finalResult = Math.max(finalResult, temp);
							if (temp == b)
								flag = 1;
						}
						if (temp > b)
							break;
					}
					if (flag == 1)
						break;
				}
			} else {
				for (int i = m - 1; i >= 0; i--) {
					for (int j = 0; j < n; j++) {
						temp = mouse[i] + keyboard[j];
						if (temp <= b) {
							finalResult = Math.max(finalResult, temp);
							if (temp == b)
								flag = 1;
						}
						if (temp > b)
							break;
					}
					if (flag == 1)
						break;
				}
			}
			System.out.println(finalResult);
		}
	}
}
