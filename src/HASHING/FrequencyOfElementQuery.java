package HASHING;

/*Problem Description
Given an array A. You have some integers given in the array B.
For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
*/

import java.util.*;

public class FrequencyOfElementQuery {

	public int[] solve(int A[], int B[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int arr[] = new int[B.length];

		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}

			// map.put(A[i], map.getOrDefault(A[i],0)+1);

		}

		for (int i = 0; i < B.length; i++) {
			if (map.containsKey(B[i])) {
				arr[i] = map.get(B[i]);
			} else {
				arr[i] = 0;
			}

		}

		// System.out.println(Arrays.toString(arr));
		return arr;

	}

	public static void main(String[] args) {

		int A[] = { 2, 5, 9, 2, 8 };
		int B[] = { 3, 2 };
		System.out.println(new FrequencyOfElementQuery().solve(A, B));
	}

}
