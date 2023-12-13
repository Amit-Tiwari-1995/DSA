package HASHING;

import java.util.*;

/*Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.
*/
public class CommonElements {

	public int[] solve(int A[], int B[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int a : A) {
			map.put(a, map.getOrDefault(a, 0) + 1);

		}

		for (int b : B) {
			if (map.containsKey(b) && map.get(b) > 0) {
				list.add(b);
				map.put(b, map.get(b) - 1);
			}

		}

		int result[] = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		//System.out.println(Arrays.toString(result));
		return result;
	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 2, 1 };
		int B[] = { 2, 3, 1, 2 };
		System.out.println(new CommonElements().solve(A, B));
	}

}
