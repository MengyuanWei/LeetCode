/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public ListNode sortList(ListNode head) {
		ListNode dHead = new ListNode(0);
		ListNode pre = dHead, start = head;
		while (start != null) {
			ListNode then = start.next;
			pre = dHead;
			while (pre.next != null && pre.next.val < start.val) {
				pre = pre.next;
			}
			start.next = pre.next;
			pre.next = start;
			start = then;
			
		}
		return dHead.next;
	}
	
}