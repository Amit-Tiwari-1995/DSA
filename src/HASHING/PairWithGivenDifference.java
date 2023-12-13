package HASHING;

import java.util.*;

/*Problem Description
Given an one-dimensional unsorted array A containing N integers.
You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.
Return 1 if any such pair exists else return 0.
*/
public class PairWithGivenDifference {

	public int solve(int A[], int B) {
		HashSet<Integer> set = new HashSet<Integer>();

		

		for (int i = 0; i < A.length; i++) {
			
			if (set.contains(A[i]-B) || set.contains(A[i]+B)) {
				return 1;
			}
			set.add(A[i]);
		}

		return 0;
	}

	public static void main(String[] args) {
		int A[] = { 90, 497, -411, 990, 145, 353, 314, -349, -260, -956, 258, -665, -241, 192, 605, 264, -819, -497,
				829, 775, -392, 292, 997, 549, 556, 561, 627, -533, 541, -871, 240, 813, 174, -399, -923, -785 };
		int B = -466;
		System.out.println(new PairWithGivenDifference().solve(A, B));
	}

}
