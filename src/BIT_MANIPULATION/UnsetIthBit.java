package BIT_MANIPULATION;

/*Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
*/
public class UnsetIthBit {

	public int solve(int A, int B) {
		if (((A >> B) & 1) == 1) {
			return A ^ (1 << B);
		}

		return A;

	}

	public static void main(String[] args) {

		int A = 5;
		int B = 2;
		System.out.println(new UnsetIthBit().solve(A, B));

	}

}
