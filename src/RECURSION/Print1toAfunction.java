package RECURSION;

/*Problem Description
You are given an integer A, print 1 to A using using recursion.
*/

public class Print1toAfunction {

	public void solve(int A) {
		if (A == 1) {
			System.out.print(1 + " ");
			return;
		}

		solve(A - 1);
		System.out.print(A + " ");

	}

	public static void main(String[] args) {

		int A = 5;
		new Print1toAfunction().solve(A);

	}

}
