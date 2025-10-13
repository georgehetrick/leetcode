package leetcode135;

import java.util.Arrays;

public class Solution {
	public int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);

		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i = 1; i < candies.length; i++) {
				if (ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
					candies[i] = candies[i - 1] + 1;
					changed = true;
				}
			}
			for (int i = candies.length - 2; i >= 0; i--) {
				if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
					candies[i] = candies[i + 1] + 1;
					changed = true;
				}
			}
		}
		
		int total = 0;
		for (int i = 0; i < candies.length; i++)
			total += candies[i];

		return total;
	}
}