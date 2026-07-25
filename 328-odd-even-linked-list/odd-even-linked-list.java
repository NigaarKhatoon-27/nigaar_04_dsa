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
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(0);
        ListNode temp  = head;
        ListNode t1 = odd;
        ListNode t2 = even;
        while(temp != null){
            t1.next = temp;
            temp = temp.next;
            t1 = t1.next;

            t2.next = temp;
            if(temp == null) break;
            temp = temp.next;
            t2 = t2.next;

        }
        odd = odd.next;
        even = even.next;
        t1.next = even;
        return odd;

    }
}