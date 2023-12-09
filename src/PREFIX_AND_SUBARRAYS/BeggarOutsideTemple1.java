package PREFIX_AND_SUBARRAYS;

//Given N beggars return total amount each beggar will get after q queries.
// Below code TC is O(Q*N)
// This is without using prefix sum
public class BeggarOutsideTemple1 {

	public int[] solve(int n, int q, int s[], int x[]) {
		int beg[] = new int[n];

		for (int i = 0; i < q; i++) {
			int start = s[i];
			int amount = x[i];
			for (int j = start; j < n; j++) {
				beg[j] = beg[j] + amount;
			}

		}

		return beg;

	}

	public static void main(String[] args) {

		int n = 6;
		int q = 5;
		int s[] = { 2, 4, 0, 0, 0 };
		int x[] = { 20, 10, 5, -5, 100 };
		System.out.println(new BeggarOutsideTemple1().solve(n, q, s, x));

	}

}
