package leetcode019;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	@Test
	public void basicTestCase1() {
		//Input: head = [1,2,3,4,5], n = 2
		//Output: [1,2,3,5]
		
		Solution solution = new Solution();
		
		ListNode head = new ListNode(5);
		head = new ListNode(4, head);
		head = new ListNode(3, head);
		head = new ListNode(2, head);
		head = new ListNode(1, head);
		
		ListNode result = solution.removeNthFromEnd(head, 2);

		assertEquals(result.val, 1);
		assertEquals(result.next.val, 2);
		assertEquals(result.next.next.val, 3);
		assertEquals(result.next.next.next.val, 5);
		assertEquals(result.next.next.next.next, null);
	}
	
	@Test
	public void basicTestCase2() {
		//Input: head = [1], n = 1
		//Output: []
		
		Solution solution = new Solution();
		
		ListNode head = new ListNode(1);
		
		ListNode result = solution.removeNthFromEnd(head, 1);
		
		assertEquals(result, null);
	}
	
	@Test
	public void basicTestCase3() {
		//Input: head = [1,2], n = 1
		//Output: [2]
		
		Solution solution = new Solution();
		
		ListNode head = new ListNode(2);
		head = new ListNode(1, head);
		
		ListNode result = solution.removeNthFromEnd(head, 2);

		assertEquals(result.val, 2);
		assertEquals(result.next, null);

		//assertEquals(21, solution.reverse(120));
	}
	
}
