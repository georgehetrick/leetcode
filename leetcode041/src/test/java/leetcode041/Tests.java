package leetcode041;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void testCase1() {
		int[] input = new int[] {7,8,9,11,12};
		Solution solution = new Solution();
		int output = solution.firstMissingPositive(input);
		
		assertEquals(1, output);
	}

	@Test
	public void testCase2() {
		int[] input = new int[] {3,4,-1,1};
		Solution solution = new Solution();
		int output = solution.firstMissingPositive(input);
		
		assertEquals(2, output);
	}

	@Test
	public void testCase3() {
		int[] input = new int[] {1,2,0};
		Solution solution = new Solution();
		int output = solution.firstMissingPositive(input);
		
		assertEquals(3, output);
	}
	
}
