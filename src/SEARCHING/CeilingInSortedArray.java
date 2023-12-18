package SEARCHING;

/*Problem Description
Given a sorted array B of integers of size A, and a integer value C, return the ceiling of C which is present in array B.
*/
public class CeilingInSortedArray {

	public int solve(int A, int B[], int C) {
		int answer = -1;

		int l = 0;
		int r = A - 1;

		while (l <= r) {
			int mid = (l + r) / 2;

			if (B[mid] == C) {
				return B[mid];
			}

			else if (B[mid] > C) {
				answer = B[mid];
				r = mid - 1;

			}

			else {

				l = mid + 1;
			}

		}

		return answer;

	}

	public static void main(String[] args) {

		int A = 5;
		int B[] = { 2, 5, 6, 9, 18 };
		int C = 7;
		System.out.println(new CeilingInSortedArray().solve(A, B, C));
	}

}



/*
 * Example Input Input 1:
 * 
 * A = 5 B = [2, 5, 6, 9, 18] C = 7 Input 2:
 * 
 * A = 6 B = [3, 7, 9, 11, 19, 20] C = 22
 * 
 * 
 * Example Output Output 1: 9 Output 2:
 * 
 * -1
 */
