package CARRY_FORWARD;

/*Problem Description
You have given a string A having Uppercase English letters.

You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
*/

public class SpecialSubsequencesAG {

	public long solve(String str) {
		int cA = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				cA++;
			}
			if (str.charAt(i) == 'G') {
				count = count + cA;
			}

		}
		return count;
	}

	public static void main(String[] args) {

		String str = "ABCGAG";
		System.out.println(new SpecialSubsequencesAG().solve(str));

	}

}

// TC: O(N)  SC: O(1)
