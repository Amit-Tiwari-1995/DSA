package HASHING;

import java.util.*;

/*Problem Description
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
*/

public class CountPairDifference {

	public int solve(int A[], int B) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i] - B)) {
				count = count + map.get(A[i] - B);
			}
			if (map.containsKey(A[i] + B)) {
				count = count + map.get(A[i] + B);
			}
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}

		return count;

	}

	public static void main(String[] args) {
		int A[] = { 12, 18 };
		int B = 6;
		System.out.println(new CountPairDifference().solve(A, B));
	}

}
