package PREFIX_AND_SUBARRAYS;

/*Problem Description
Kamal is a software developer and he's working on a new feature for an e-commerce website. The website has a list of prices for different products, and Kamal needs to find the maximum price of all products up to a given index.

He has the list of prices in an array A of length N, and he needs to write a program that will return the maximum price occurring in the subarray from 0 to i for every index i. Kamal needs your help to implement this function.
*/

public class PrefixMaximum {

	public int[] solve(int arr[]) {
		int result[] = new int[arr.length];
		int max = arr[0];
		result[0] = max;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result[i] = max;
			} else {
				result[i] = result[i - 1];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 16, 8, 24, 9, 25, 17 };
		System.out.println(new PrefixMaximum().solve(arr));

	}

}
