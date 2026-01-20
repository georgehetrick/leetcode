package leetcode065;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void testCase1() {
		Solution solution = new Solution();
		assertTrue(solution.isNumber("0"));
	}
	@Test
	public void testCase2() {
		Solution solution = new Solution();
		assertFalse(solution.isNumber("e"));
	}
	@Test
	public void testCase3() {
		Solution solution = new Solution();
		assertFalse(solution.isNumber("."));
	}
	
}
