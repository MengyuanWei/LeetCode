/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) return;
		ListNode p1 = head, p2 = head;
		while (p2.next != null && p2.next.next != null) {
		// Find the middle of the list
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		// Reverse the list after p1
		ListNode pre = p1;
		ListNode start = p1.next;
		ListNode then = start.next;
		while (then != null) {
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
		}
		
		
		// Reorder
		p1 = head;
		p2 = pre.next;
		while (p1 != pre) {
			pre.next = p2.next;
			p2.next = p1.next;
			p1.next = p2;
			p1 = p2.next;
			p2 = pre.next;
		}
	}
}