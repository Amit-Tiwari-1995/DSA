package SUB_ARRAYS;

/*Problem Description

Given an integer array A of length N. Print all possible subarray.
*/
public class PrintSubArrays {

	public void solve(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");

				}

				System.out.println();
			}

		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		new PrintSubArrays().solve(arr);
	}

}
