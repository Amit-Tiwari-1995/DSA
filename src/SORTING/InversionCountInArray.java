package SORTING;

/*Problem Description
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).
*/
public class InversionCountInArray {

	static int count = 0;
	static int mod = 1000000007;

	public int[] merge(int left[], int right[]) {

		int n = left.length;
		int m = right.length;
		int result[] = new int[n + m];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n && j < m) {

			if (left[i] <= right[j]) {
				result[k++] = left[i++];

			} else {

				count = (count + (n - i)) % mod;

				result[k++] = right[j++];

			}

		}

		while (i < n) {
			result[k++] = left[i++];
		}

		while (j < m) {
			result[k++] = right[j++];
		}

		return result;

	}

	public int[] mergeSort(int A[], int l, int h) {
		if (l == h) {
			int a[] = new int[1];
			a[0] = A[l];
			return a;
		}

		int mid = (l + h) / 2;

		int left[] = mergeSort(A, l, mid);

		int right[] = mergeSort(A, mid + 1, h);

		int ans[] = merge(left, right);

		return ans;

	}

	public int solve(int A[]) {
		count = 0;

		mergeSort(A, 0, A.length - 1);

		return count % mod;

	}

	public static void main(String[] args) {

		int A[] = { 3, 4, 1, 2 };
		System.out.println(new InversionCountInArray().solve(A));
	}

}

/*
 * Example Input Input 1:
 * 
 * A = [1, 3, 2] Input 2:
 * 
 * A = [3, 4, 1, 2]
 * 
 * 
 * Example Output Output 1:
 * 
 * 1 Output 2:
 * 
 * 4
 */
