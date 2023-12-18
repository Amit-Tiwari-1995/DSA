package SEARCHING;

/*Problem Description
Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(logN) time.
NOTE:
A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.
*/
public class SearchInBitonicArray {

	public int solve(int A[], int B) {
		int point = -1;
		int l = 0;
		int r = A.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
				point = mid + 1;
				break;

			} else if (A[mid] > A[mid + 1]) {
				r = mid - 1;
			} else if (A[mid] > A[mid - 1]) {
				l = mid + 1;
			}

		}

		l = 0;
		r = point - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (A[mid] == B) {
				return mid;
			} else if (A[mid] > B) {
				r = mid - 1;
			} else {
				l = mid + 1;

			}

		}

		l = point;
		r = A.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (A[mid] == B) {
				return mid;
			} else if (A[mid] < B) {
				r = mid - 1;
			} else {
				l = mid + 1;

			}

		}

		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 };
		int B = 5;

		System.out.println(new SearchInBitonicArray().solve(arr, B));

	}

}

/*
 * Example Input Input 1:
 * 
 * A = [3, 9, 10, 20, 17, 5, 1] B = 20 Input 2:
 * 
 * A = [5, 6, 7, 8, 9, 10, 3, 2, 1] B = 30
 * 
 * 
 * Example Output Output 1:
 * 
 * 3 Output 2:
 * 
 * -1
 */
