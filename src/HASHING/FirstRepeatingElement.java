package HASHING;

import java.util.*;


/*Problem Description
Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.
*/
public class FirstRepeatingElement {

	public int solve(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		int answer = -1;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (set.contains(arr[i])) {
				answer = arr[i];
			}
			set.add(arr[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		System.out.println(new FirstRepeatingElement().solve(arr));
	}

}
