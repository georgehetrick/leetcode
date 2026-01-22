package leetcode044;

import java.util.regex.Pattern;

public class Solution {
    Pattern single = Pattern.compile("\\?");
    Pattern many   = Pattern.compile("\\*+");

    /**
     * This times out in one of the test cases, so is not good enough,
     * but it's what I have for now.
     */
    public boolean isMatch(String s, String p) {
        String part1 = single.matcher(p).replaceAll(".");
        String part2 = "^"+many.matcher(part1).replaceAll(".*?")+"$";
        return Pattern.matches(part2, s);
	}
}
