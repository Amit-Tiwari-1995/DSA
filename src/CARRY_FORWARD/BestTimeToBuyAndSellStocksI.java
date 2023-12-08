package CARRY_FORWARD;

/*Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.
*/

public class BestTimeToBuyAndSellStocksI {

	public int solve(int arr[]) {
		int profit = 0;
		int buy = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (buy > arr[i]) {
				buy = arr[i];
			}

			profit = Math.max(profit, arr[i] - buy);

		}

		return profit;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 2, 4 };
		System.out.println(new BestTimeToBuyAndSellStocksI().solve(arr));

	}

}

// TC : O(N) SC: O(1)
