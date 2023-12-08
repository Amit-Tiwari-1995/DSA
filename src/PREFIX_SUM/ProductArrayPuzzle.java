package PREFIX_SUM;

/*Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.
*/

public class ProductArrayPuzzle {

	public int[] solve(int arr[]) {

		int result[] = new int[arr.length];

		int pFix[] = new int[arr.length];
		int sFix[] = new int[arr.length];

		pFix[0] = arr[0];
		sFix[sFix.length - 1] = arr[arr.length - 1];

		for (int i = 1; i < arr.length; i++) {
			pFix[i] = pFix[i - 1] * arr[i];
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			sFix[i] = sFix[i + 1] * arr[i];
		}

		for (int i = 0; i < result.length; i++) {
			if (i == 0) {
				result[i] = sFix[i + 1];
			} else if (i == result.length - 1) {
				result[i] = pFix[i - 1];
			} else {
				result[i] = pFix[i - 1] * sFix[i + 1];
			}

		}

		return result;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 10, 1 };
		System.out.println(new ProductArrayPuzzle().solve(arr));
	}

}
