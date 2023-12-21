package SORTING;

import java.util.*;

/*Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.
*/
public class LargestNumber {

	public String solve(ArrayList<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {

			public int compare(Integer a, Integer b) {
				String sa = String.valueOf(a);

				String sb = String.valueOf(b);

				if ((sa + sb).compareTo((sb + sa)) > 0) {

					return -1;

				} else if ((sb + sa).compareTo((sa + sb)) > 0) {
					return 1;
				} else {
					return 0;
				}

			}

		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < A.size(); i++) {
			sb = sb.append(A.get(i));
		}

		if (sb.charAt(0) == '0') {
			return "0";
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(7, 3, 9, 9, 5, 2));
		System.out.println(new LargestNumber().solve(A));

	}

}

/*
 * Example Input Input 1:
 * 
 * A = [3, 30, 34, 5, 9] Input 2:
 * 
 * A = [2, 3, 9, 0]
 * 
 * 
 * Example Output Output 1:
 * 
 * "9534330" Output 2:
 * 
 * "9320"
 */

