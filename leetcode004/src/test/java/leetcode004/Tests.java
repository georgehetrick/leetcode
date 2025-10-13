package leetcode004;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();

		double testOutput1 = solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 });
		assertEquals(testOutput1, 2.5, "new int[] { 1, 2 }, new int[] { 3, 4 } should equal 2.5");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		
		double testOutput2 = solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
		assertEquals(testOutput2, 2, "new int[] { 1, 3 }, new int[] { 2 } should equal 2");
	}
	
}
