package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

	static Integer[] leftRotation(Integer[] a, int d) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		List<Integer> x = Arrays.asList(a);
		temp.addAll(x.subList(d, x.size()));
		temp.addAll(x.subList(0, d));
		return temp.toArray(a);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		Integer[] a = new Integer[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		Integer[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
