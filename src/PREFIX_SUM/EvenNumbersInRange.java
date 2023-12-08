package PREFIX_SUM;

/*Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*/

public class EvenNumbersInRange {

	public int[] solve(int arr[], int B[][]) {
		int result[] = new int[B.length];

		int preFix[] = new int[arr.length];

		preFix[0] = arr[0] % 2 == 0 ? 1 : 0;

		for (int i = 1; i < arr.length; i++) {
			preFix[i] = arr[i] % 2 == 0 ? preFix[i - 1] + 1 : preFix[i - 1];

		}

		for (int i = 0; i < B.length; i++) {
			int start = B[i][0];
			int end = B[i][1];

			result[i] = start == 0 ? preFix[end] : preFix[end] - preFix[start - 1];

		}

		return result;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 1, 8, 3, 9, 6 };
		int B[][] = { { 0, 3 }, { 3, 5 }, { 1, 3 }, { 2, 4 } };

		System.out.println(new EvenNumbersInRange().solve(arr, B));

	}

}
