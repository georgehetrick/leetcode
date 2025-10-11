package leetcode004;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalLength = nums1.length + nums2.length;
		double midpoint = (totalLength + 1) / 2.0;
		int index1 = 0;
		int index2 = 0;
		int lastValue = 0;
		int previousValue = 0;

		/*
		 * Deal with edge cases
		 */
		if (nums1.length == 0) {
			if (nums2.length == 0)
				return 0;
			else if (nums2.length == 1)
				return nums2[0];
		} else if (nums2.length == 0) {
			if (nums1.length == 1)
				return nums1[0];
		}

		while (index1 + index2 <= midpoint) {
			previousValue = lastValue;
			if (nums1.length == index1) {
				lastValue = nums2[index2];
				index2++;
			} else if (nums2.length == index2) {
				lastValue = nums1[index1];
				index1++;
			} else if (nums1[index1] < nums2[index2]) {
				lastValue = nums1[index1];
				index1++;
			} else {
				lastValue = nums2[index2];
				index2++;
			}
		}
	
		/*
		 * If an odd number then last value is median; if even, average of last 2 values
		 */
		if (totalLength % 2 == 1) {
			return previousValue;
		} else {
			return (lastValue + previousValue) / 2.0;
		}

	}
}
