package CARRY_FORWARD;

/*Problem Description
You are given an integer array A of size N.

You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.

Find and return the maximum possible sum of the B elements that were removed after the B operations.

NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.*/

public class PickFromBothSides {

	public int solve(int arr[], int B) {

		int leftSum = 0;
		int maxSum = 0;

		for (int i = 0; i < B; i++) {
			leftSum = leftSum + arr[i]; // 6
		}

		maxSum = leftSum;

		for (int i = 0; i < B; i++) {
			leftSum = leftSum - arr[B - 1 - i] + arr[arr.length - 1 - i];
			maxSum = Math.max(maxSum, leftSum);
		}

		return maxSum;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, -1, 4, 2, 1 };
		int B = 4;
		System.out.println(new PickFromBothSides().solve(arr, B));
	}

}
