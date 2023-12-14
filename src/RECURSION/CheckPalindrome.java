package RECURSION;

/*Problem Description
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.
Note: A palindrome is a string that's the same when read forward and backward.
*/
public class CheckPalindrome {

	public boolean palindrome(String A, int start, int end) {
		if (start > end) {
			return true;
		}
		if ((A.charAt(start) == A.charAt(end)) && palindrome(A, start + 1, end - 1)) {
			return true;
		} else {
			return false;
		}
	}

	public int solve(String A) {

		boolean answer = palindrome(A, 0, A.length() - 1);

		return answer == true ? 1 : 0;

	}

	public static void main(String[] args) {

		String A = "mmadamm";
		System.out.println(new CheckPalindrome().solve(A));
	}

}
