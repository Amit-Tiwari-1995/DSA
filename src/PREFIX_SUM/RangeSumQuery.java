package PREFIX_SUM;

/*Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*/

public class RangeSumQuery {

	public long[] solve(int arr[], int B[][]) {
		long result[] = new long[B.length];
		long preFix[] = new long[arr.length];

		preFix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			preFix[i] = preFix[i - 1] + arr[i];
		}

		for (int i = 0; i < B.length; i++) {
			int start = B[i][0];
			int end = B[i][1];

			if (start == 0) {
				result[i] = preFix[end];
			} else {
				result[i] = preFix[end] - preFix[start - 1];
			}

		}

		return result;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2 };
		int B[][] = { { 0, 0 }, { 1, 2 } }; // [10,5]
		System.out.println(new RangeSumQuery().solve(arr, B));
	}

}
