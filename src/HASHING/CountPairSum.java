package HASHING;

import java.util.*;

/*Problem Description
You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
*/
public class CountPairSum {

	public int solve(int A[], int B) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			int value = B - A[i];
			if (map.containsKey(value)) {
				count = count + map.get(value);
			}

			map.put(A[i], map.getOrDefault(A[i], 0) + 1);

		}

		return count;

	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 1, 2 };
		int B = 3;
		System.out.println(new CountPairSum().solve(A, B));
	}

}
