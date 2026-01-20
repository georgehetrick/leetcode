package leetcode875;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {

	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();
		assertEquals(4, solution.minEatingSpeed(new int[] { 3,6,7,11 }, 8));
	}
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();
		assertEquals(30, solution.minEatingSpeed(new int[] { 30,11,23,4,20 }, 5));
	}
	@Test
	public void basicTestCase3() {
		Solution solution = new Solution();
		assertEquals(23, solution.minEatingSpeed(new int[] { 30,11,23,4,20 }, 6));
	}
}