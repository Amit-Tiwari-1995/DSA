package BIT_MANIPULATION;

/*Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
*/
public class ToggleIthBit {

	public int solve(int A, int B) {

		if (((A >> B) & 1) == 1) {
			return A ^ (1 << B);
		}

		return A | (1 << B);

	}

	public static void main(String[] args) {

		int A = 5;
		int B = 2;
		System.out.println(new ToggleIthBit().solve(A, B));

	}

}
