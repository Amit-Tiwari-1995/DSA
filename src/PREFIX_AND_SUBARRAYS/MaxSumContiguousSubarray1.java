package PREFIX_AND_SUBARRAYS;

/*Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
*/
public class MaxSumContiguousSubarray1 {

	public int solve(int arr[]) {

		int max = Integer.MIN_VALUE;

		int pf[] = new int[arr.length];
		pf[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			pf[i] = pf[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				int sum = 0;
				if (i == 0) {
					sum = pf[j];
				} else {
					sum = pf[j] - pf[i - 1];
				}

				max = Math.max(max, sum);

			}
		}

		return max;
	}

	public static void main(String[] args) {

		int arr[] = { -3, 4, 1 };
		System.out.println(new MaxSumContiguousSubarray1().solve(arr));
	}
}
