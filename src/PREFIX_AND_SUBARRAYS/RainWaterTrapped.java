package PREFIX_AND_SUBARRAYS;

/*Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
*/
public class RainWaterTrapped {

	public int solve(int arr[]) {
		int answer = 0;

		int leftMax[] = new int[arr.length];
		int rightMax[] = new int[arr.length];

		leftMax[0] = arr[0];
		rightMax[rightMax.length - 1] = arr[arr.length - 1];

		int max1 = leftMax[0];
		int max2 = rightMax[rightMax.length - 1];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];
				leftMax[i] = max1;
			} else {
				leftMax[i] = leftMax[i - 1];
			}

		}

		for (int i = rightMax.length - 2; i >= 0; i--) {
			if (arr[i] > max2) {
				max2 = arr[i];
				rightMax[i] = max2;
			} else {
				rightMax[i] = rightMax[i + 1];
			}

		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (Math.min(leftMax[i - 1], rightMax[i + 1]) > arr[i]) {
				answer = answer + (Math.min(leftMax[i - 1], rightMax[i + 1]) - arr[i]);
			}

		}

		return answer;

	}

	public static void main(String[] args) {

		int A[] = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
		System.out.println(new RainWaterTrapped().solve(A));

	}

}
