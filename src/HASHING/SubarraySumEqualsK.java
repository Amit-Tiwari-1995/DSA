package HASHING;

import java.util.*;

/*Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
*/
public class SubarraySumEqualsK {

	public int solve(int A[], int B) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int count = 0;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
			int value = sum - B;
			if (map.containsKey(value)) {
				count = count + map.get(value);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return count;

	}

	public static void main(String[] args) {
		int A[] = { 0, 0, 0 };
		int B = 0;
		System.out.println(new SubarraySumEqualsK().solve(A, B));
	}

}
