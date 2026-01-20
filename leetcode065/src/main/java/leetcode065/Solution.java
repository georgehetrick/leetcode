package leetcode065;

import java.util.regex.Pattern;

/*
 * I could certainly write a small parser that would execute in 1/2 the time of a Pattern,
 * but the Pattern is 1 line long and can be understood by anyone who knows Pattern syntax.
 * 
 * Writing a parser, would be a dozen line of fragile code, and would not be simple to
 * be certain of. You'd certainly need to write tests for edge cases that simply don't
 * exist for the Pattern
 */

public class Solution {

	static String numericPattern = "[-+]?(\\d+\\.?|\\.\\d+|\\d+\\.\\d*)(e[-+]?\\d+)?";
	static Pattern pattern = Pattern.compile(numericPattern, Pattern.CASE_INSENSITIVE);

	public static boolean isNumber(String s) {
		return pattern.matcher(s).matches();

	}
}
