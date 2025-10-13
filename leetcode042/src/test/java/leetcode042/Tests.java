package leetcode042;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();
		
		int[] heights = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int testOutput = solution.trap(heights);
		assertEquals(testOutput, 6, "expected 6");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		
		int[] heights = new int[] { 4, 2, 0, 3, 2, 5 };
		int testOutput = solution.trap(heights);
		assertEquals(testOutput, 9, "expected 6");
	}	
}
