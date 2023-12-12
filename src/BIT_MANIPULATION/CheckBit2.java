package BIT_MANIPULATION;

/*Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
*/
public class CheckBit2 {

	public int solve(int A, int B) {

		B = 1 << B; // Just left shift 1 B times

		if ((A & B) != 0) { // Add B to the A. If resultant is 0 then bit is not set other wise bit is set
			return 1;
		}

		return 0;

	}

	public static void main(String[] args) {

		int A = 10;
		int B = 1;
		System.out.println(new CheckBit2().solve(A, B));

	}

}
