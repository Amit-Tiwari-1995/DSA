package RECURSION;

/*Problem Description
Write a program to find the factorial of the given number A using recursion.
Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
*/
public class FindFactorial {

	public int solve(int A) {
		if (A == 0 || A == 1) {
			return 1;
		}
		return solve(A - 1) * A;

	}

	public static void main(String[] args) {

		int A = 5;
		System.out.println(new FindFactorial().solve(A));

	}

}
