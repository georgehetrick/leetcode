package leetcode011;

import org.junit.jupiter.api.*;

import leetcode011.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();
		
		int maxarea = solution.maxArea(new int[] {1,8,6,2,5,4,8,3,7});
		assertEquals(maxarea, 49, "maxArea of {1,8,6,2,5,4,8,3,7} should be 49");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		
		int maxarea = solution.maxArea(new int[] {1,1});
		assertEquals(maxarea, 1, "maxArea of {1,1} should be 1");
	}
	
}
