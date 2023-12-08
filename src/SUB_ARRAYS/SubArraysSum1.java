package SUB_ARRAYS;

/*Problem Description

Given an integer array A of length N. Print array of numbers in which each element is sum of a subarray.
*/

// THIS IS USING PREFIX SUM
public class SubArraysSum1 {

	public void solve(int arr[]) {

		int preFix[] = new int[arr.length];
		preFix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			preFix[i] = preFix[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				if (i == 0) {
					System.out.println(preFix[j]);
				} else {
					System.out.println(preFix[j] - preFix[i - 1]);
				}
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		new SubArraysSum1().solve(arr);
	}

}
