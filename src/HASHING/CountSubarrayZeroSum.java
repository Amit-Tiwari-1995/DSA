package HASHING;

import java.util.*;

/*Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
*/
public class CountSubarrayZeroSum {

	public int solve(int A[]) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int count = 0;
		int mod = 1000000007;

		int pf[] = new int[A.length];

		pf[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			pf[i] = pf[i - 1] + A[i];
		}

		for (int i = 0; i < pf.length; i++) {
			if (pf[i] == 0) {
				count++;
			}
			if (map.containsKey(pf[i])) {
				count = count + map.get(pf[i]);
				map.put(pf[i], map.get(pf[i]) + 1);
			} else {
				map.put(pf[i], 1);
			}

		}

		return count % mod;

	}

	public static void main(String[] args) {

		int A[] = { 0, 0, 0 };
		System.out.println(new CountSubarrayZeroSum().solve(A));

	}

}
