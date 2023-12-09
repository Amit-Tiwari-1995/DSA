package PREFIX_AND_SUBARRAYS;

//Given N beggars return total amount each beggar will get after q queries.
// Below code TC is O(N+Q)
// This is using prefix sum

public class BeggarOutsideTemple2 {

	public int[] solve(int n, int q, int s[], int x[]) {

		int beg[] = new int[n];

		for (int i = 0; i < q; i++) {
			int start = s[i];
			int amount = x[i];
			beg[start] = beg[start] + amount;

		}

		// By preFix sum calculate total amount for each beggar
		for (int i = 1; i < beg.length; i++) {
			beg[i] = beg[i - 1] + beg[i];
		}

		return beg;

	}

	public static void main(String[] args) {

		int n = 6;
		int q = 5;
		int s[] = { 2, 4, 0, 0, 0 };
		int x[] = { 20, 10, 5, -5, 100 };
		System.out.println(new BeggarOutsideTemple2().solve(n, q, s, x));

	}
}
