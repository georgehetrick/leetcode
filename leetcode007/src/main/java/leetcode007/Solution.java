package leetcode007;

/**
 * Simple is better.
 * 
 * Letting Java do all the work avoids worrying about edge cases.
 * 
 * The negative value space is larger than the positive value space, so we can flip the sign of 
 * a negative number without worries.
 * 
 */
class Solution {
	public int reverse(int x) {
		try {
			boolean negative = false;
			if (x<0) {
				x = -x;
				negative = true;
			}
			int value = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            if (negative)
                return -value;
            else
                return value;
		} catch(Exception e) {
			return 0;
		}
	}
	
}