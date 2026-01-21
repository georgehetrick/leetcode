package leetcode334;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void testCase1() {
		Solution solution = new Solution();
		assertTrue(solution.increasingTriplet(new int[] { 1, 2, 3, 4, 5 } ));
	}
	@Test
	public void testCase2() {
		Solution solution = new Solution();
		assertFalse(solution.increasingTriplet(new int[] { 5, 4, 3, 2, 1 } ));
	}
	@Test
	public void testCase3() {
		Solution solution = new Solution();
		assertTrue(solution.increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6, 7 } ));
	}
}