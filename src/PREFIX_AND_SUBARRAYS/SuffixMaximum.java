package PREFIX_AND_SUBARRAYS;

/*Problem Description
Given an array A of length N, For every index i, you need to find the maximum value in subarray from i to N-1.
*/

public class SuffixMaximum {

	public int[] solve(int arr[]) {
		int result[] = new int[arr.length];
		int max = arr[arr.length - 1];
		result[result.length - 1] = max;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				result[i] = max;
			} else {
				result[i] = result[i + 1];
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 15, 9, 7, 11, 10 };
		System.out.println(new SuffixMaximum().solve(arr));

	}

}
