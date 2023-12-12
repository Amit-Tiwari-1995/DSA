package BIT_MANIPULATION;

/*Problem Description
You are given two integers A and B.
Return 1 if B-th bit in A is set
Return 0 if B-th bit in A is unset
Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
*/
public class CheckBit1 {

	public int solve(int A, int B) {
		A = A >> B; // Just shift A to B times to right using right shift(>>) operator

		if ((A & 1) == 1) {// (A&1) we can check by this that bit is set or not
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {

		int A = 5;
		int B = 1;
		System.out.println(new CheckBit1().solve(A, B));

	}

}
