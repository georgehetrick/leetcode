package leetcode875;

public class Solution {
	public int minEatingSpeed(int[] piles, int h) {
		long total = 0;
		for (int i = 0; i < piles.length; i++)
			total += piles[i];

		// The smallest number per hour possible
		// if each pile is divisible by h
		//
		long start = Math.max(1,total/h);

		// The largest number per hour possible
		// if no pile is divisible by h
		//
		long end = total;

		// Now, do a binary search between start and end
		//
		long speed = 0;
		do {
			speed = (start + end + 1) / 2;
			long hours_spent = getHoursSpent(piles, speed);
			if (hours_spent <= h) {
				end = speed;
			} else {
				start = speed;
			}
		} while (start < (end - 1));
		if (getHoursSpent(piles, start) <= h)
			return (int) start;
		else
			return (int) end;
	}

	private static long getHoursSpent(int[] piles, long speed) {
		long hours_spent = 0;
		for (int i = 0; i < piles.length; i++) {
			hours_spent += (piles[i] + speed - 1) / speed;
		}
		return hours_spent;
	}
}
