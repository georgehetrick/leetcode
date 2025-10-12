package leetcode009;

public class Solution {
    public boolean isPalindrome(int x) {
        if (true) {
        	// Faster then using StringBuilder, but not as simple, and a maintenance issue
        	//
            char[] string = Integer.toString(x).toCharArray();
            int length = string.length;
            for (int i=0; i<length/2; i++) {
                if (string[i] != string[length-i-1])
                    return false;
            }
            return true;
        } else {
            // Really simple, and the way I'd do it if performance wasn't important
            //
            String string = Integer.toString(x);
            return string.equals(new StringBuilder(string).reverse().toString());
            }
        }
}