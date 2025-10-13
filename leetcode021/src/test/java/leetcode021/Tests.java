package leetcode021;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {
    	ListNode first = new ListNode(11);
    	first = new ListNode(5, first);
    	first = new ListNode(-1, first);
    	ListNode second = new ListNode(10);
    	second = new ListNode(3, second);
    	
    	Solution solution = new Solution();
    	
      	ListNode testOutput = solution.mergeTwoLists(first, second);
      	
      	int[] expected = new int[] {-1, 3, 5, 10, 11};
      	
      	for (int i=0; i<expected.length; i++) {
      		assertEquals(testOutput.val, expected[i]);
      		testOutput = testOutput.next;
      	}
      	assertEquals(testOutput, null);
	}
	
}
