package HASHING;

import java.util.*;

/*Problem Description
Given an array A of N integers, return the number of unique elements in the array.
*/
public class CountDistinctElements {

	public int solve(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		return set.size();
	}

	public static void main(String[] args) {
		int arr[] = { 3, 3, 3, 9, 0, 1, 0 };
		System.out.println(new CountDistinctElements().solve(arr));
	}

}
