package SUB_ARRAYS;

/*Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
*/

public class GoodSubArray1 {

	public int solve(int arr[], int B) {

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				count++;
				sum = sum + arr[j];

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

		int arr[] = { 1, 2, 3, 4, 5 };
		int B = 4;
		System.out.println(new GoodSubArray1().solve(arr, B));

	}

}
