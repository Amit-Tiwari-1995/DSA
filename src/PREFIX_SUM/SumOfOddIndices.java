package PREFIX_SUM;

/*Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing
*/

public class SumOfOddIndices {

	public int[] solve(int arr[], int B[][]) {
		int result[] = new int[B.length];

		int preFix[] = new int[arr.length];

		preFix[0] = 0;

		for (int i = 1; i < arr.length; i++) {
			preFix[i] = i % 2 != 0 ? preFix[i - 1] + arr[i] : preFix[i - 1];

		}

		for (int i = 0; i < B.length; i++) {
			int start = B[i][0];
			int end = B[i][1];

			result[i] = start == 0 ? preFix[end] : preFix[end] - preFix[start - 1];

		}

		return result;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 8, 3, 9 };
		int B[][] = { { 0, 3 }, { 2, 4 } };

		System.out.println(new SumOfOddIndices().solve(arr, B));

	}

}
