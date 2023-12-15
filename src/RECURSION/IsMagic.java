package RECURSION;

public class IsMagic {

	public int solve(int A) {
		if (A == 0) {
			return 0;
		}

		int sum = (A / 10) + (A % 10);

		if (sum > 9) {
			sum = solve(sum);
		}

		if (sum == 1) {
			return 1;
		}
		return 0;

	}

	public static void main(String[] args) {
		int A = 83557;
		System.out.println(new IsMagic().solve(A));
	}

}
