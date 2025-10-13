package leetcode042;

import java.util.Arrays;

public class Solution {
	public int trap(int[] height) {
		// First, get max height
		//
		int maxHeight = 0;
		for (int i = 0; i < height.length; i++)
			maxHeight = Math.max(maxHeight, height[i]);

		// Sort heights to learn transition heights
		//
		int[] transitions = Arrays.stream(height).sorted().distinct().toArray();
		int heightIndex = 0;

		// Next, check each grid element to see if it holds water
		//
		int count = 0;
		for (int level = 1; level <= maxHeight; level++) {
			// Get left bound
			//
			int left = -1;

			for (int i = 0; i < height.length; i++) {
				if (height[i] >= level) {
					left = i;
					break;
				}
			}

			// Get right bound
			//
			int right = -1;

			for (int i = height.length - 1; i >= 0; i--) {
				if (height[i] >= level) {
					right = i;
					break;
				}
			}

			// check elements between
			//
			int rowSum = 0;
			for (int i = left + 1; i < right; i++) {
				if (height[i] < level) {
					rowSum++;
				}
			}

			// If this was the first row in a new range, skip over the rest of the range
			//
			if (level == transitions[heightIndex] + 1 && heightIndex < transitions.length - 1) {
				count += rowSum * (transitions[heightIndex + 1] - transitions[heightIndex]);
				heightIndex++;
				level = transitions[heightIndex];
			} else {
				count += rowSum;
			}

		}
		return count;
	}

}
