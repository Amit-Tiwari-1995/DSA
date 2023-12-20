package SORTING;

/*Problem Description
Given an integer array A, sort the array using Merge Sort.
*/
public class MergeSort {

	public int[] merge(int A[], int B[]) {
		int n = A.length;
		int m = B.length;
		int result[] = new int[n + m];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n && j < m) {
			if (A[i] < B[j]) {
				result[k++] = A[i++];
			} else {
				result[k++] = B[j++];
			}
		}

		while (i < n) {
			result[k++] = A[i++];
		}

		while (j < m) {
			result[k++] = B[j++];
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

	public int[] solve(int A[]) {
		int sortedArray[] = mergeSort(A, 0, A.length - 1);
	//	System.out.println(Arrays.toString(sortedArray));
		return sortedArray;
	}

	public static void main(String[] args) {

		int A[] = { 1, 4, 10, 2, 1, 5 };
		System.out.println(new MergeSort().solve(A));

	}

}

/*
 * Example Input Input 1:- A = [1, 4, 10, 2, 1, 5] Input 2:- A = [3, 7, 1]
 * 
 * 
 * Example Output Output 1:- [1, 1, 2, 4, 5, 10] Output 2:- [1, 3, 7]
 */