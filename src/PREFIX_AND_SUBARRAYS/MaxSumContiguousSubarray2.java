package PREFIX_AND_SUBARRAYS;

/*Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
*/

// KADANE'S ALGORITHM
public class MaxSumContiguousSubarray2 {

	public int solve(int arr[]) {

		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;

		for (int i = 0; i < arr.length; i++) {
			curSum = curSum + arr[i];
			maxSum = Math.max(maxSum, curSum);

			if (curSum < 0) {
				curSum = 0;
			}
		}

		return maxSum;

	}

	public static void main(String[] args) {

		int arr[] = { -3, 4, 1 };
		System.out.println(new MaxSumContiguousSubarray2().solve(arr));
	}
}
