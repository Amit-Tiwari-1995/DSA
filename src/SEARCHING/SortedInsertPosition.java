package SEARCHING;

/*Problem Description
You are given a sorted array A of size N and a target value B.
Your task is to find the index (0-based indexing) of the target value in the array.

If the target value is present, return its index.
If the target value is not found, return the index of least element greater than equal to B.
Your solution should have a time complexity of O(log(N)).
*/
public class SortedInsertPosition {

	public int solve(int A[], int B) {
		int l = 0;
		int r = A.length-1 ;
		int answer = -1;

		while (l <= r) {
			int mid = (l + r) / 2;
		
			if (A[mid] == B) {
				return mid;
			}

			else if (A[mid] > B) {
				r = mid - 1;
			} 
			
			else {
				answer = mid;
				l = mid + 1;
			}

		}

		return answer+1;

	}

	public static void main(String[] args) {

		int A[] = { 1, 4, 9 };
		int B = 3;
		System.out.println(new SortedInsertPosition().solve(A, B));
	}

}



/*
 * Example Input Input 1:
 * 
 * A = [1, 3, 5, 6] B = 5 
 * 
 * Input 2:
 * 
 * A = [1, 4, 9] B = 3
 * 
 * 
 * Example Output Output 1:
 * 
 * 2 
 * Output 2:
 * 
 * 1
 */

