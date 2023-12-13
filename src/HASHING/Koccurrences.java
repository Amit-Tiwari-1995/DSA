package HASHING;

import java.util.*;

/*Groot has N trees lined up in front of him where the height of the i'th tree is denoted by H[i].
He wants to select some trees to replace his broken branches.
But he wants uniformity in his selection of trees.
So he picks only those trees whose heights have frequency B.
He then sums up the heights that occur B times. (He adds the height only once to the sum and not B times).
But the sum he ended up getting was huge so he prints it modulo 10^9+7.
In case no such cluster exists, Groot becomes sad and prints -1.
*/
public class Koccurrences {

	public int solve(int A, int B, int[] C) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int mod = 1000000007;
		boolean flag = false;

		for (int c : C) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == B) {
				sum = (sum + m.getKey()) % mod;
				flag = true;
			}
		}

		return flag == true ? sum % mod : -1;

	}

	public static void main(String[] args) {

		int C[] = { 1, 2, 2, 3, 3 };
		int B = 2;
		int A = C.length;
		System.out.println(new Koccurrences().solve(A, B, C));
	}

}
