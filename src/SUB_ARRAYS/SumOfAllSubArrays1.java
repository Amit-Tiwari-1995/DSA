package SUB_ARRAYS;

/*Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
*/

//THIS IS USING TC O(N^2)

public class SumOfAllSubArrays1 {

	public long solve(int arr[]) {
		long totalSum = 0;

		for (int i = 0; i < arr.length; i++) {
			long sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				totalSum = totalSum + sum;

			}

		}
		return totalSum;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		System.out.println(new SumOfAllSubArrays1().solve(arr));
	}

}
