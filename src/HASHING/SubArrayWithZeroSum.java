package HASHING;

import java.util.*;

/*Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.
*/
public class SubArrayWithZeroSum {

	public int solve(int arr[]) {

		HashSet<Long> set = new HashSet<Long>();
		long pf[] = new long[arr.length];
		pf[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			pf[i] = pf[i - 1] + arr[i];
		}

		for (int i = 0; i < pf.length; i++) {
			if (pf[i] == 0) {
				return 1;
			}

			if (set.contains(pf[i])) {
				return 1;
			}
			set.add(pf[i]);
		}

		return 0;

	}

	public static void main(String[] args) {

		int arr[] = { 4, 1, -5 };
		System.out.println(new SubArrayWithZeroSum().solve(arr));

	}

}
