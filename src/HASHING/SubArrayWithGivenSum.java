package HASHING;

import java.util.*;;

public class SubArrayWithGivenSum {

	public int[] solve(int A[], int B) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		map.put(0, -1);
		int start = 0;
		int end = 0;
		boolean flag = false;

		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];
			int value = sum - B;
			if (map.containsKey(value)) {
				start = map.get(value) + 1;
				end = i;
				flag = true;
				break;

			}
			map.put(sum, i);

		}
		if (!flag) {
			return new int[] {-1};
		}

		int result[] = new int[end - start + 1];

		int index = 0;
		for (int i = start; i <= end; i++) {
			result[index] = A[i];
			index++;
		}

		return result;

	}

	public static void main(String[] args) {
		int A[] = { 5, 10, 20, 100, 105 };
		int B = 110;

		System.out.println(new SubArrayWithGivenSum().solve(A, B));
	}

}
