package BIT_MANIPULATION;

/*Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
*/

public class NumberOfOneBits2 {

	public int solve(int numb) {

		int count = 0;

		while (numb != 0) {
			if ((numb & 1) == 1) {
				count++;
			}
			numb = numb >> 1;
		}

		return count;

	}

	public static void main(String[] args) {
		int numb = 47;
		System.out.println(new NumberOfOneBits2().solve(numb));
	}

}
