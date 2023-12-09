package PREFIX_AND_SUBARRAYS;

/*Problem Description
There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
*/

public class ContinuousSumQuery {

	public int[] solve(int A, int B[][]) {
		int result[] = new int[A];
		int queries = B.length;

		for (int i = 0; i < queries; i++) {
			int l = B[i][0] - 1;
			int r = B[i][1] - 1;
			int amount = B[i][2];

			result[l] = result[l] + amount;

			if (r < A - 1) {
				result[r + 1] = result[r + 1] - amount;
			}

		}

		for (int i = 1; i < result.length; i++) {
			result[i] = result[i - 1] + result[i];
		}

		return result;

	}

	public static void main(String[] args) {

		int A = 5;
		int B[][] = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };
		System.out.println(new ContinuousSumQuery().solve(A, B));

	}

}
