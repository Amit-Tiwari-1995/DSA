package RECURSION;

/*Problem Description
Write a recursive function that takes a string, S, as input and prints the characters of S in reverse order.
*/
public class PrintReverseString {

	public void print(String S, int n) {
		if (n == 0) {
			System.out.print(S.charAt(0));
			return;
		}
		System.out.print(S.charAt(n));
		print(S, n - 1);
	}

	public void solve(String S) {
		print(S, S.length() - 1);
	}

	public static void main(String[] args) {
		String S = "dream";
		new PrintReverseString().solve(S);
	}

}
