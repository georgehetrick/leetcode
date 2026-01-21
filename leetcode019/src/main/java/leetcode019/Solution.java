package leetcode019;

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode[] cycle = new ListNode[n+1];
		int index = 0;
		int length = 0;
		
		for (ListNode current = head; current != null; current = current.next) {
			cycle[index] = current;
			index = (index+1)%cycle.length;
			length++;
		}
		
		// If we are removing head, return head.next
        // Otherwise, remove the current node by setting the previous node to point past 
		//
		if (length==n) {
			return head.next;
		} else {
            ListNode previous = cycle[index%cycle.length];
            previous.next = previous.next.next;
			return head;
        }
	}
	
}