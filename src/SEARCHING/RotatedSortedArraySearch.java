package SEARCHING;

/*Problem Description
Given a sorted array of integers A of size N and an integer B, 
where array A is rotated at some pivot unknown beforehand.

For example, the array [0, 1, 2, 4, 5, 6, 7] might become [4, 5, 6, 7, 0, 1, 2].

Your task is to search for the target value B in the array. If found, return its index; otherwise, return -1.

You can assume that no duplicates exist in the array.

NOTE: You are expected to solve this problem with a time complexity of O(log(N)).
*/

public class RotatedSortedArraySearch {

	public int solve(int A[], int B) {
		int start = 0;
		int end = A.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (A[mid] == B) {
				return mid;
			}

			// check if array start-mid is sorted or not
			else if (A[start] <= A[mid]) {
				if (A[start] <= B && A[mid] >= B) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			}

			// check if array mid+1 to end is sorted or not
			else {
				if (A[mid] <= B && A[end] >= B) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int A[] = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };
		int B = 9;
		System.out.println(new RotatedSortedArraySearch().solve(A, B));
	}

}



/*
 * Example Input Input 1:
 * 
 * A = [4, 5, 6, 7, 0, 1, 2, 3] B = 4 Input 2:
 * 
 * A : [ 9, 10, 3, 5, 6, 8 ] B : 5
 * 
 * 
 * Example Output Output 1:
 * 
 * 0 Output 2:
 * 
 * 3
 */