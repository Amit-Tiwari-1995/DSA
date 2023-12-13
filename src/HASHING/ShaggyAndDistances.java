package HASHING;

import java.util.*;

/*Problem Description
Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array a special if elements at those indices in the array are equal.
Shaggy wants you to find a special pair such that the distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.
*/
public class ShaggyAndDistances {

	public int solve(int A[]) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < A.length; i++) {
			if (m.containsKey(A[i])) {
				min = Math.min(min, i - m.get(A[i]));
			}
			m.put(A[i], i);
		}

		return min != Integer.MAX_VALUE ? min : -1;

	}

	public static void main(String[] args) {
		int A[] = { 1,1};
		System.out.println(new ShaggyAndDistances().solve(A));

	}

}
