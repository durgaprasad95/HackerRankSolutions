package implementation;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisted {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] cloStat = new int[n];
		for (int i = 0; i < n; i++)
			cloStat[i] = in.nextInt();
		in.close();
		int E = 100, cycle = 0;
		for (int i = 0; i < n; i = i + 0) {
			if (i == 0)
				cycle++;
			if (cycle == 2)
				break;
			i = (i + k) % n;
			E--;
			if (cloStat[i] == 1)
				E -= 2;
		}
		System.out.println(E);
	}
}
