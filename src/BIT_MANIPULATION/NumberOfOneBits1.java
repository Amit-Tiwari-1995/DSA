package BIT_MANIPULATION;

/*Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
*/

public class NumberOfOneBits1 {

	public boolean check(int numb, int i) {
		numb = numb >> i;

		if ((numb & 1) == 1) {
			return true;
		}

		return false;

	}

	public int solve(int numb) {

		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (check(numb, i)) {
				count++;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		int numb = 47;
		System.out.println(new NumberOfOneBits1().solve(numb));
	}

}
