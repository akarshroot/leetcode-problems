/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode tempHead = new ListNode(-200, head);
        ListNode ptr = tempHead;
        ListNode uniquePtr = null;
        while(ptr != null) {
            if(ptr.next != null && ptr.val == ptr.next.val) {
                while(ptr.next != null && ptr.val == ptr.next.val) ptr = ptr.next;
                if(ptr.next == null) {
                    uniquePtr.next = null;
                    break;
                }
                uniquePtr.next = ptr.next;
            }
            else {
                uniquePtr = ptr;
            }
            ptr = ptr.next;
        }
        return tempHead.next;
    }
}
