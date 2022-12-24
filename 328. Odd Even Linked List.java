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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode ptr = head;
        ListNode evenSkipped = ptr.next;
        ListNode oddSkipped = ptr;
        ListNode evenHead = ptr.next;
        Boolean isEven = false;
        while(ptr.next != null) {
            if(isEven) {
                oddSkipped = ptr.next;
                ptr.next = ptr.next.next;                
                ptr = oddSkipped;
            }
            else {
                evenSkipped = ptr.next;
                ptr.next = ptr.next.next;
                ptr = evenSkipped;
            }
            isEven = !isEven;
        }
        if(oddSkipped != null) oddSkipped.next = evenHead;
        return head;
    }
}
