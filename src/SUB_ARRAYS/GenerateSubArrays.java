package SUB_ARRAYS;

import java.util.ArrayList;

/*Problem Description
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array

Note : The order of the subarrays in the resulting 2D array does not matter.
*/

public class GenerateSubArrays {

	public ArrayList<ArrayList<Integer>> solve(int arr[]) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();

				for (int k = i; k <= j; k++) {
					temp.add(arr[k]);
				}
				list.add(temp);

			}

		}
		return list;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		System.out.println(new GenerateSubArrays().solve(arr));

	}

}
