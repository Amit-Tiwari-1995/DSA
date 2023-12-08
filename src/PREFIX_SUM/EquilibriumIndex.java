package PREFIX_SUM;

public class EquilibriumIndex {

	/*
	 * Problem Description You are given an array A of integers of size N.
	 * 
	 * Your task is to find the equilibrium index of the given array
	 * 
	 * The equilibrium index of an array is an index such that the sum of elements
	 * at lower indexes is equal to the sum of elements at higher indexes.
	 * 
	 * If there are no elements that are at lower indexes or at higher indexes, then
	 * the corresponding sum of elements is considered as 0.
	 * 
	 * Note:
	 * 
	 * Array indexing starts from 0. If there is no equilibrium index then return
	 * -1. If there are more than one equilibrium indexes then return the minimum
	 * index.
	 */

	public int solve(int arr[]) {

		int leftSum[] = new int[arr.length];
		int rightSum[] = new int[arr.length];

		leftSum[0] = 0;
		rightSum[rightSum.length - 1] = 0;
		int count = 0;

		for (int i = 1; i < leftSum.length; i++) {
			leftSum[i] = leftSum[i - 1] + arr[i];
		}

		for (int i = rightSum.length - 2; i >= 0; i--) {
			rightSum[i] = rightSum[i + 1] + arr[i];
		}

		for (int i = 0; i < leftSum.length; i++) {
			if (leftSum[i] == rightSum[i]) {
				count++;
			}
		}

		return count != 0 ? count : -1;

	}

	public static void main(String[] args) {

		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(new EquilibriumIndex().solve(arr));

	}

}
