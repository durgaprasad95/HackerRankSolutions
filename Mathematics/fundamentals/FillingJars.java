import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int M = in.nextInt();
        BigInteger temp=BigInteger.ZERO;
	for (int i = 1; i <= M; i++) {
		int a = in.nextInt();
		int b = in.nextInt();
		int k = in.nextInt();
       		temp=temp.add((BigInteger.valueOf(b-a+1)).multiply(BigInteger.valueOf(k)));
	}
	System.out.println(Math.round((temp.divide(BigInteger.valueOf(N))).doubleValue()));
	in.close();
    }
}
