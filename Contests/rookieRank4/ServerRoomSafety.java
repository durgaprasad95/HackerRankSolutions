package rookieRank4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ServerRoomSafety {
	static String checkAll(int n, int[] height, int[] position) {
		Map<Integer, Integer> HP = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			HP.put(position[i], height[i]);
		}
		Integer[] mappedHeight = HP.values().toArray(new Integer[0]);
		Integer[] sortedPosition = HP.keySet().toArray(new Integer[0]);
		boolean leftFlag = leftCheck(n, mappedHeight, sortedPosition),
				rightFlag = rightCheck(n, mappedHeight, sortedPosition);
		if (leftFlag && rightFlag)
			return "BOTH";
		if (leftFlag)
			return "LEFT";
		if (rightFlag)
			return "RIGHT";
		else
			return "NONE";

	}

	static boolean leftCheck(int n, Integer[] height, Integer[] position) {
		boolean result = true;
		int count = 0, temp = 0, tempIndex = 0;
		for (int i = 0; i < n - 1; i++) {
			if (count == 0) {
				temp = position[i] + height[i];
				tempIndex = i;
			}
			if (temp >= position[i + 1]) {
				if ((position[i + 1] + height[i + 1]) >= (position[tempIndex] + height[tempIndex])) {
					count = 0;
					continue;
				}
				++count;
				result = true;
			} else {
				if (count == 0)
					return false;
				i = i - 1;
				count = 0;
			}
		}
		return result;
	}

	static boolean rightCheck(int n, Integer[] height, Integer[] position) {
		boolean result = true;
		int count = 0, temp = 0, tempIndex = 0, changedDiff = position[n - 1] - height[n - 1], changedIndex = 0;
		for (int i = n - 1; i > 0; i--) {
			if (count == 0) {
				temp = position[i] - height[i];
				tempIndex = i;
			}
			if (temp <= position[i - 1]) {
				if ((position[i - 1] + height[i - 1]) >= (position[tempIndex] + height[tempIndex])) {
					count = 0;
					continue;
				}
				if ((position[i - 1] - height[i - 1]) <= changedDiff) {
					changedDiff = position[i - 1] - height[i - 1];
					changedIndex = i - 1;
				}
				++count;
				result = true;
			} else {
				if (count == 0)
					return false;
				if (changedDiff == position[n - 1] - height[n - 1])
					i = i + 1;
				else
					i = changedIndex + 1;
				count = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] position = new int[n];
		for (int position_i = 0; position_i < n; position_i++) {
			position[position_i] = in.nextInt();
		}
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		String ret = checkAll(n, height, position);
		System.out.println(ret);
		in.close();
	}
}
