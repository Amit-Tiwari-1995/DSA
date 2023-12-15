package HASHING;

import java.util.*;

/*Problem Description
Given a 2D array A of integer points on a 2D plane. Find and return the number of unique points in the array.
The ith point in the array is (A[i][0], A[i][1])
*/
public class Unique2dPoints {

	public int solve(int A[][]) {
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i][0] + "@" + A[i][1]);
		}
		return set.size();
	}

	public static void main(String[] args)

	{
		int[][] A = { { 1, 1 }, { 2, 2 }, { 2, 2 }, { 1, 1 }, { 1, 1 } };
	    System.out.println(new Unique2dPoints().solve(A));
	 
	}

}
