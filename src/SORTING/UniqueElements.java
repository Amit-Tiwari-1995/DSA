package SORTING;

import java.util.Arrays;

/*Problem Description
You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.

Find the minimum number of steps.
*/
public class UniqueElements {

	public int solve(int A[]) {
		Arrays.sort(A);
		int count = 0;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i + 1] == A[i]) {

				int a = A[i]+1;
				A[i + 1] = a ;
				count++;

			} else if(A[i] > A[i+1]) {
				
				int a=A[i]+1;
				count = count + (a - A[i + 1]);
				A[i+1]=a;
				

			}

		}

		System.out.println(Arrays.toString(A));
		return count;
	}

	public static void main(String[] args) {

		int A[] = { 1, 1 , 1 ,2   };
		System.out.println(new UniqueElements().solve(A));
	}

}


/*
 * Example Input Input 1:
 * 
 * A = [1, 1, 3] Input 2:
 * 
 * A = [2, 4, 5]
 * 
 * 
 * Example Output Output 1:
 * 
 * 1 Output 2:
 * 
 * 0
 */

