package HASHING;

import java.util.*;

/*Problem Description
Given an unsorted integer array A of size N.
Find the length of the longest set of consecutive elements from array A.
*/
public class LongestConsecutiveSequence {

	public int solve(int A[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		int max = 1;

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}

		for (int i = 0; i < A.length; i++) {

			int value = A[i];

			if (!set.contains(value - 1)) {

				int count = 1;
				while (set.contains(value + 1)) {
					value++;
					count++;

				}

				max = Math.max(max, count);

			}

		}

		return max;

	}

	public static void main(String[] args) {

		int A[] = { 27, 26, 25, 33, 32, 31, 30 };
		System.out.println(new LongestConsecutiveSequence().solve(A));

	}

}
