package HASHING;

import java.util.*;

/*Problem Description
Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.

If there is no subarray which sums to zero then return 0
*/
public class LongestSubarrayZeroSum {

	public int solve(int A[]) {
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		int maxSize = 0;

		long pf[] = new long[A.length];
		pf[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			pf[i] = pf[i - 1] + A[i];
		}

		for (int i = 0; i < A.length; i++) {

			if (pf[i] == 0) {
				maxSize = Math.max(maxSize, i + 1);
			}

			if (map.containsKey(pf[i])) {
				maxSize = Math.max(maxSize, i - map.get(pf[i]));
			} else {
				map.put(pf[i], i);
			}

		}

		return maxSize;

	}

	public static void main(String[] args) {
		int A[] = { 6, 2, -2, -6, 6 };
		System.out.println(new LongestSubarrayZeroSum().solve(A));
	}

}
