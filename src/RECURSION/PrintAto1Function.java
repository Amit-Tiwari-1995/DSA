package RECURSION;

/*Problem Description
You are given an integer A, print A to 1 using using recursion.
*/
public class PrintAto1Function {

	public void solve(int A) {

		if (A == 0) {
			return;
		}
		System.out.print(A + " ");
		solve(A - 1);

	}

	public static void main(String[] args) {

		int A = 10;
		new PrintAto1Function().solve(A);
	}

}
