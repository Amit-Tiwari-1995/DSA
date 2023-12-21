package SORTING;

import java.util.*;

/*Problem Description
You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space
*/

public class FactorsSort {

	public int countFactors(int numb) {
		int count = 0;

		for (int i = 1; i * i <= numb; i++) {
			if (numb % i == 0) {
				if (i == numb / i) {
					count++;
				} else {
					count = count + 2;
				}

			}

		}

		return count;

	}

	public ArrayList<Integer> solve(ArrayList<Integer> A) {

		Collections.sort(A, new Comparator<Integer>() {

			public int compare(Integer a, Integer b) {
				if (countFactors(a) < countFactors(b)) {
					return -1;
				}

				else if (countFactors(a) > countFactors(b)) {
					return 1;
				}

				else {
					if (a < b) {
						return -1;
					} else if (a > b) {
						return 1;
					} else {
						return 0;
					}

				}

			}

		});

		return A;

	}

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 7));

		System.out.println(new FactorsSort().solve(A));

	}

}

/*
 * Example Input Input 1: A = [6, 8, 9] Input 2: A = [2, 4, 7]
 * 
 * 
 * Example Output Output 1: [9, 6, 8] Output 2: [2, 7, 4]
 */
