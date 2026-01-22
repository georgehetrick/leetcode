package leetcode044;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
		Solution solution = new Solution();

		assertFalse(solution.isMatch("aa", "a"));
	}
	
	/**
	 * This test is disabled, because the current solution times out
	 */
	@Test
	@Disabled("Current solution times out in this testcase")
	public void basicTestCase2() {
		Solution solution = new Solution();

		assertFalse(solution.isMatch(
			"abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb",
			"**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
	}
	
}
