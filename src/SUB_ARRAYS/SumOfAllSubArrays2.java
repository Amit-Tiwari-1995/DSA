package SUB_ARRAYS;

/*Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
*/

//THIS IS USING TC O(N)

public class SumOfAllSubArrays2 {

	public long solve(int arr[]) {
		long totalSum = 0;
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {

			totalSum = totalSum + (arr[i] * (i + 1) * (n - i));
			// possible values of start index if subarray contains ith index= [0,i] =>
			// (r-l+1) => i-0+1 => i+1

			// possible values of end index if subarray contains ith index= [i,n-1] =>
			// (r-l+1) => (n-1)-(i)+1=> n-i

		}

		return totalSum;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		System.out.println(new SumOfAllSubArrays2().solve(arr));
	}

}
