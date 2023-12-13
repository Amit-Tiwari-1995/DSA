package HASHING;

import java.util.HashSet;

/*Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
*/

public class CheckPairSum {
	public int solve(int A, int B[]) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < B.length; i++) {
			int value = A - B[i];
			if (set.contains(value)) {
				return 1;
			}
			set.add(B[i]);
		}

		return 0;

	}

	public static void main(String[] args) {
		int A = 8;
		int B[] = { 3, 5, 1, 2, 1, 2 };
		System.out.println(new CheckPairSum().solve(A, B));
	}

}
