package BIT_MANIPULATION;

public class SetBit {

	public int solve(int A, int B) {
		int answer = 1 << A;

		answer = answer | (1 << B);

		return answer;

	}

	public static void main(String[] args) {
		int A = 3;
		int B = 5;
		System.out.println(new SetBit().solve(A, B));
	}

}
