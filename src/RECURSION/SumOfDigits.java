package RECURSION;

/*Problem Description
Given a number A, we need to find the sum of its digits using recursion.
*/
public class SumOfDigits {

	public int solve(int A) {

		if (A == 0) {
			return 0;
		}

		int x = solve(A / 10) + A % 10;
		
		

		return x;

	}

	public static void main(String[] args) {

		int A = 83557;
		System.out.println(new SumOfDigits().solve(A));

	}

}
