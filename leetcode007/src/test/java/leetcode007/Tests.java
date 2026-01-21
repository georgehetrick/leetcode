package leetcode007;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();

		assertEquals(21, solution.reverse(120));
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();

		assertEquals(-321, solution.reverse(-123));
	}
	
	@Test
	public void basicTestCase3() {
		Solution solution = new Solution();

		assertEquals(321, solution.reverse(123));
	}

}
