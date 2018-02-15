package codiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrimeNumbersAndQueries {

	static int maxDifference(int startVal, int endVal, int[] primes) {
		if (startVal == endVal)
			return 0;
		else {
			int leastPrime = 0, count = 0, largestPrime = 0;
			for (int i = startVal; i <= endVal; i++)
				if (primes[i] == 1) {
					leastPrime = i;
					break;
				}
			for (int i = endVal; i >= startVal; i--)
				if (primes[i] == 1) {
					largestPrime = i;
					break;
				}
			return largestPrime - leastPrime;
		}
	}

	// Sieve of Eratosthenes
	static int[] primeNumbers() {
		int[] primes = new int[1000001];
		Arrays.fill(primes, 1);
		for (int i = 2; i <= 1000000; i++) {
			if (primes[i] != 0)
				for (int k = 2 * i; k < 1000000; k += i)

					primes[k] = 0;
		}
		return primes;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine().trim());
		int[] primes = primeNumbers();
		for (int a0 = 0; a0 < q; a0++) {
			String str = br.readLine();
			String input[] = str.split(" ");
			int startVal = Integer.parseInt(input[0]);
			int endVal = Integer.parseInt(input[1]);
			int result = maxDifference(startVal, endVal, primes);
			System.out.println(result);
		}
	}
}
