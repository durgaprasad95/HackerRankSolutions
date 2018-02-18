package rookieRank4;

import java.util.Arrays;
import java.util.Scanner;

public class ExamRush {

	static int examRush(int[] tm, int t) {
		Arrays.sort(tm);
		long result = 0, length = tm.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			result += tm[i];
			if (result <= t)
				count += 1;
			else
				return count;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int[] tm = new int[n];
		for (int tm_i = 0; tm_i < n; tm_i++) {
			tm[tm_i] = in.nextInt();
		}
		int result = examRush(tm, t);
		System.out.println(result);
		in.close();
	}

}
