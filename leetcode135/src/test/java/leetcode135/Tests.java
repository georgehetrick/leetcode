package leetcode135;

import org.junit.jupiter.api.*;

import leetcode135.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();
		
		int testOutput = solution.candy(new int[] { 1, 0, 2 });
		assertEquals(testOutput, 5, "Expected 5");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		
		int testOutput = solution.candy(new int[] { 1, 2, 2 });
		assertEquals(testOutput, 4, "Expected 4");
	}	
}
