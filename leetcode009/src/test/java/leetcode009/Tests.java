package leetcode009;

import org.junit.jupiter.api.*;

import leetcode009.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();

		boolean testOutput = solution.isPalindrome(121);
		assertTrue(testOutput, "121 should be a palindrome)");
	}
	
	@Test
	public void basicTestCase2() {
		Solution solution = new Solution();

		boolean testOutput = solution.isPalindrome(-121);
		assertFalse(testOutput, "-121 should not be a palindrome)");
	}
	
	@Test
	public void basicTestCase3() {
		Solution solution = new Solution();

		boolean testOutput = solution.isPalindrome(10);
		assertFalse(testOutput, "10 should not be a palindrome)");
	}
	
}
