package SUB_ARRAYS;

/*Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
*/

// THIS IS USING PREFIX SUM

public class GoodSubArray2 {

	public int solve(int arr[], int B) {

		int pf[] = new int[arr.length];
		int result = 0;

		pf[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			pf[i] = pf[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = i; j < arr.length; j++) {

				count++;
				int sum;

				if (i == 0) {
					sum = pf[j];
				} else {
					sum = pf[j] - pf[i];
				}

				if (count % 2 != 0 && sum > B) {
					result++;
				} else if (count % 2 == 0 && sum < B) {
					result++;
				}

			}

		}

		return result;

	}

	public static void main(String[] args) {

		int arr[] = { 13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9 };
		int B = 65;
		System.out.println(new GoodSubArray2().solve(arr, B));

	}

}
