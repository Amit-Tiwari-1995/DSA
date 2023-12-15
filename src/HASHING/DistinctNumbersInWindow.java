package HASHING;

import java.util.*;

/*Problem Description
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
NOTE: if B > N, return an empty array.
*/
public class DistinctNumbersInWindow {

	public int[] solve(int A[], int B) {
		int result[] = new int[A.length - B + 1];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < B; i++) {
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		result[0] = map.size();

		int start = 1;
		int end = B;

		while (end < A.length) {

			map.put(A[start - 1], map.get(A[start - 1]) - 1);

			if (map.get(A[start - 1]) == 0) {
				map.remove(A[start - 1]);
			}

			map.put(A[end], map.getOrDefault(A[end], 0) + 1);
			result[start] = map.size();
			start++;
			end++;

		}

		return result;

	}

	public static void main(String[] args) {

		int A[] = { 1, 2, 1, 3, 4, 3 };
		int B = 3;
		System.out.println(new DistinctNumbersInWindow().solve(A, B));

	}

}
