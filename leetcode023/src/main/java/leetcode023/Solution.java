package leetcode023;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
};

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    	ListNode result = new ListNode();
    	ListNode current = result;
    	
    	// Get lists actually containing elements
    	// refer to them by index in the input array
    	//
    	List<Integer> listsInUse = new ArrayList<Integer>();
    	for (int i=0; i<lists.length; i++) {
    		if (lists[i]!=null) {
    			listsInUse.add(i);
    		}
    	}
    	
    	while (listsInUse.size()>0) {
    		int best = 0;
            int bestIndex = listsInUse.get(best);
    		
    		// Find the next value
    		//
    		for (int i=1; i<listsInUse.size(); i++) {
    			if (lists[listsInUse.get(i)].val < lists[bestIndex].val)
    				best = i;
                    bestIndex = listsInUse.get(best);
    		}
    		current.next = lists[bestIndex];
            current = current.next;
    		
            // Advance the input list
            //
    		lists[bestIndex] = lists[bestIndex].next;
    		
    		// Remove the list if it's exhausted
    		//
    		if (lists[bestIndex]==null) {
    			listsInUse.remove(best);
    		}
    		
    	}
		return result.next;
    }
}
