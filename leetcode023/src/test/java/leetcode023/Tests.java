package leetcode023;

import org.junit.jupiter.api.*;

import leetcode023.Solution;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void basicTestCase1() {

    	ListNode second = new ListNode(11);
    	second = new ListNode(5, second);
    	second = new ListNode(-1, second);
    	ListNode fourth = new ListNode(10);
    	fourth = new ListNode(6, fourth);
    	
    	Solution solution = new Solution();
    	
      	ListNode testOutput = solution.mergeKLists(new ListNode[] {null, second, null, fourth});
      	
      	
      	int[] expected = new int[] {-1, 5, 6, 10, 11};
      	
      	for (int i=0; i<expected.length; i++) {
      		assertEquals(testOutput.val, expected[i]);
      		testOutput = testOutput.next;
      	}
      	assertEquals(testOutput, null);
	}
	
}
