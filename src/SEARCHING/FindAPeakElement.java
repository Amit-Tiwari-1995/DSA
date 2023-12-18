package SEARCHING;

/*Problem Description
Given an array of integers A, find and return the peak element in it.
An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.

NOTE:

It is guaranteed that the array contains only a single peak element.
Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
*/

public class FindAPeakElement {

	public int solve(int A[]) {
		if (A.length == 1) {
			return A[0];
		}
		
		else if (A[0] > A[1]) {
			return A[0];
		} else if (A[A.length - 1] > A[A.length - 2]) {
			return A[A.length - 1];
		}

		int l = 1;
		int r = A.length - 2;

		while (l  <=  r) {
			int mid = (l + r) / 2;
			if (A[mid] >= A[mid + 1] && A[mid] >= A[mid - 1]) {
				return A[mid];
			} else if (A[mid] <= A[mid + 1]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

		}
		
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = {1,1000000000,1000000000};
		System.out.println(new FindAPeakElement().solve(arr));
	}

}

/*
 * Example Input Input 1:
 * 
 * A = [1, 2, 3, 4, 5] Input 2:
 * 
 * A = [5, 17, 100, 11]
 * 
 * 
 * Example Output Output 1:
 * 
 * 5 Output 2:
 * 
 * 100
 */