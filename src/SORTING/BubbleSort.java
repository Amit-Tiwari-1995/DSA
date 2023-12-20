package SORTING;

import java.util.Arrays;

/*Problem Description
Implement Bubble Sort in the article below.
Given an integer array A of size N, sort the array using bubble sort algorithm.

Return the array after sorting.
*/

public class BubbleSort {

	public int[] solve(int A[]) {

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length-1; j++) {
				if (A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;

				}

			}
			System.out.println(Arrays.toString(A));

		}

		return A;

	}

	public static void main(String[] args) {

		int A[] = { 5, 1, 13, 8, 9, 2, 11, 7 };
		System.out.println(new BubbleSort().solve(A));
	}

}

/*
 * Example Input Input 1: A = [1, 4, 3, 2] Input 2:
 * 
 * A = [4, 2, 1, 4]
 * 
 * 
 * Example Output Output 1: [1, 2, 3, 4] Output 2:
 * 
 * [1, 2, 4, 4]
 */
