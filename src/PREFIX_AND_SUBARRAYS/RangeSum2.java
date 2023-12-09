package PREFIX_AND_SUBARRAYS;

/*Problem Description
You are given an integer array A of size N. You need to perform Q queries on the given array and return the final array after processing all the queries.

Each query is of the form (l, r, c), where l and r are indices (1-based) representing a range in the array A, and c is an integer value.

For each query, you are required to add the value c to every element within the range [l, r] (inclusive).
*/


public class RangeSum2 {

	public int[] solve(int A[], int B[][]) {

		int result[] = new int[A.length];

		for (int i = 0; i < B.length; i++) {
			int l = B[i][0] - 1;
			int r = B[i][1] - 1;
			int c = B[i][2];

			result[l] = result[l] + c;

			if (r < A.length - 1) {
				result[r + 1] = result[r + 1] - c;
			}

		}

		for (int i = 1; i < result.length; i++) {
			result[i] = result[i - 1] + result[i];
		}

		for (int i = 0; i < A.length; i++) {
			result[i] = result[i] + A[i];
		}

		return result;

	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 1, 4 };
		int B[][] = { { 2, 3, 2 }, { 1, 4, 5 }, { 4, 4, 1 } };
		System.out.println(new RangeSum2().solve(A, B));
	}

}
