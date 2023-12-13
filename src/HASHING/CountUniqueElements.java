package HASHING;

import java.util.*;

/*Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
*/
public class CountUniqueElements {

	public int solve(int A[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int count = 0;

		for (int i = 0; i < A.length; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		int A[] = { 3, 3, 3, 9, 0, 1, 0 };
		System.out.println(new CountUniqueElements().solve(A));

	}

}
