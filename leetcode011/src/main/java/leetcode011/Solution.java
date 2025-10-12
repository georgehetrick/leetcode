package leetcode011;

public class Solution {
    public int maxArea(int[] height) {
    	int maxarea=0;
    	
        for (int first=0; first<height.length-1; first++) {
            /*
             * Only need to check if it's possible to have a greater area
             * with this height
             */
            if (height[first]*(height.length-first)>maxarea) {
                for (int second=first+1; second<height.length; second++) {
                    int area = (second-first)*Math.min(height[first], height[second]);
                    maxarea = Math.max(area, maxarea);
                }
            }
        }
        return maxarea;
    }
}