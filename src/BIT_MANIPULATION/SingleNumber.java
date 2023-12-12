package BIT_MANIPULATION;

/*Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class SingleNumber {
	public int solve(int arr[]) {
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			int value=arr[i];
			ans = ans ^ value;
			//by XOR property : A^0=A and A^A=0
		}
		return ans;

	}

	public static void main(String[] args) {

		int arr[] = { 2,5,3,2,3,1,5 };
		System.out.println(new SingleNumber().solve(arr));

	}

}
