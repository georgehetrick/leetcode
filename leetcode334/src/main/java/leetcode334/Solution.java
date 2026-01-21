package leetcode334;

import java.util.stream.IntStream;

class Solution {
	// Computed with loops
	//
	public boolean increasingTriplet0(int[] nums) {
		int count = 0;
		for (int first = 0; first < nums.length - 2; first++) {
			for (int second = first + 1; second < nums.length - 1; second++) {
				if (nums[first] < nums[second]) {
					for (int third = second + 1; third < nums.length; third++) {
						if (nums[second] < nums[third]) {
							return true;
						}
					}
				}
			}
		}
		return count > 0;
	}

	// Computed with streams, and tuples kept
	//
	public boolean increasingTriplet1(int[] nums) {
		return IntStream.range(0, nums.length - 2).boxed().flatMap(first -> {
			return IntStream.range(first + 1, nums.length - 1).mapToObj(second -> new int[] { first, second })
					.filter(pair -> nums[pair[0]] < nums[pair[1]]);
		}).flatMap(pair -> {
			return IntStream.range(pair[1] + 1, nums.length).mapToObj(third -> new int[] { pair[0], pair[1], third })
					.filter(triple -> nums[triple[1]] < nums[triple[2]]);
		}).count() > 0;
	}

	// Computed with streams
	//
	public boolean increasingTriplet2(int[] nums) {
		return IntStream.range(0, nums.length - 2).flatMap(first -> {
			return IntStream.range(first + 1, nums.length - 1).filter(second -> nums[first] < nums[second]);
		}).flatMap(second -> {
			return IntStream.range(second + 1, nums.length).filter(third -> nums[second] < nums[third]);
		}).findFirst().isPresent();
	}

	// Computed with linear time
	//
	public boolean increasingTriplet(int[] nums) {
		int[] min_values = new int[nums.length];

		/*
		 * For each element in nums, get the minimum value in nums that precedes it in
		 * the array
		 */
		min_values[0] = nums[0];
		for (int i = 1; i < nums.length - 1; i++) {
			min_values[i] = Math.min(min_values[i - 1], nums[i]);
		}

		/*
		 * For each element in nums, get the maximum value in nums that follows it in
		 * the array
		 */
		int max_value = nums[nums.length - 1];
		for (int i = nums.length - 2; i > 0; i--) {
			/*
			 * Now that we know the max above and min below for this particular element,
			 * check to see if we've satisfied the definition of a triple
			 */
			if (min_values[i] < nums[i] && max_value > nums[i]) {
				return true;
			}
			max_value = Math.max(max_value, nums[i]);
		}

		return false;
	}

}