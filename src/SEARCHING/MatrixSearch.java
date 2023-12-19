package SEARCHING;

/*Problem Description
Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.
*/
public class MatrixSearch {

	public int solve(int A[][], int B) {
		int start = 0;
		int end = A.length - 1;

		int targetRow = -1;

		// first search for the row which may contain the element
		while (start <= end) {
			int mid = (start + end) / 2;

			if (A[mid][0] == B || A[mid][A[0].length - 1] == B) {
				return 1;
			} else if (A[mid][0] < B && A[mid][A[0].length - 1] > B) {
				targetRow = mid;
				break;
			} else if (A[mid][0] < B) {

				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		if (targetRow == -1) {
			return 0;
		}
		start = 0;
		end = A[0].length - 1;

		//now search in that row which contains the elements
		while (start <= end) {
			int mid = (start + end) / 2;
			if (A[targetRow][mid] == B) {
				return 1;
			} else if (A[targetRow][mid] < B) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		int A[][] = { { 5, 17, 100, 111 }, { 119, 120, 127, 131 } };
		int B = 3;
		System.out.println(new MatrixSearch().solve(A, B));
	}

}


/*
 * Example Input Input 1:
 * 
 * A = [ [1, 3, 5, 7] [10, 11, 16, 20] [23, 30, 34, 50] ] B = 3 Input 2:
 * 
 * A = [ [5, 17, 100, 111] [119, 120, 127, 131] ] B = 3
 * 
 * 
 * Example Output Output 1:
 * 
 * 1 
 * 
 * Output 2:
 * 
 * 0
 
 */

