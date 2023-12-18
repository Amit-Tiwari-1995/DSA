package SEARCHING;

/*Problem Description
Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.

Return an array of size 2, such that 
          First element = Left most index of B in A
          Second element = Right most index of B in A.
If B is not found in A, return [-1, -1].

Note : Your algorithm's runtime complexity must be in the order of O(log n).
*/

public class SearchForRange {

	public int second(int A[], int B) {
		int l = 0;
		int r = A.length - 1;
		int answer = -1;

		while (l <= r) {

			int mid = (l + r) / 2;
			if (A[mid] == B) {
				answer = mid;
				l = mid + 1;
			} else if (A[mid] > B) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}

		}

		return answer;

	}

	public int first(int A[], int B) {
		int l = 0;
		int r = A.length - 1;
		int answer = -1;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (A[mid] == B) {
				answer = mid;
				r = mid - 1;
			}

			else if (A[mid] > B)

			{
				r = mid - 1;
			} else {
				l = mid + 1;
			}

		}

		return answer;

	}

	public int[] solve(int A[], int B) {

		return new int[] { first(A, B), second(A, B) };

	}

	public static void main(String[] args) {

		int arr[] = { 5, 7, 7, 8, 8, 10 };
		int B = 8;
		System.out.println(new SearchForRange().solve(arr, B));
	}

}

/*
 * Example Input Input 1:
 * 
 * A = [5, 7, 7, 8, 8, 10] B = 8 Input 2:
 * 
 * A = [5, 17, 100, 111] B = 3
 * 
 * 
 * Example Output Output 1:
 * 
 * [3, 4] Output 2:
 * 
 * [-1, -1]
 */
