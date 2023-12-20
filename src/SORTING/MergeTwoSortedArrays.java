package SORTING;

/*Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

Note: A linear time complexity is expected and you should avoid use of any library function.
*/

public class MergeTwoSortedArrays {

	public int[] solve(int A[], int B[]) {
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
		
		//System.out.println(Arrays.toString(result));
		return result;

	}

	public static void main(String[] args) {
		int A[] = { -4 ,3 , 0};
		int B[] = { 2 };  
		System.out.println(new MergeTwoSortedArrays().solve(A, B));
	}

}

/*
 * Example Input Input 1:
 * 
 * A = [4, 7, 9] B = [2, 11, 19] Input 2:
 * 
 * A = [1] B = [2]
 * 
 * 
 * Example Output Output 1:
 * 
 * [2, 4, 7, 9, 11, 19] Output 2:
 * 
 * [1, 2]
 */