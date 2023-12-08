package CARRY_FORWARD;

import java.util.*;


/*Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.*/

public class LeadersInArray {

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int max = A.get(A.size() - 1);
		result.add(max);

		for (int i = result.size() - 2; i >= 0; i--) {
			if (max < A.get(i)) {
				max = A.get(i);
				result.add(max);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(5, 4));
		System.out.println(new LeadersInArray().solve(A));
	}

}

//TC : O(N)   SC : O(1)  ArrayList will not count in space as it is given in question to return the ArrayList
