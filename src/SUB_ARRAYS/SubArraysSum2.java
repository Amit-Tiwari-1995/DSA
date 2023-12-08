package SUB_ARRAYS;

/*Problem Description

Given an integer array A of length N. Print array of numbers in which each element is sum of a subarray.
*/

// THIS IS NOT USING PREFIX SUM
public class SubArraysSum2 {

	public void solve(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum = sum + arr[j];
				System.out.println(sum);
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		new SubArraysSum2().solve(arr);
	}

}
