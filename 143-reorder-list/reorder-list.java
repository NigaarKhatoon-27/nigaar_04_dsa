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
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode temp1 = head;
        ListNode temp2 = reverseList(slow.next);
        slow.next = null;
        while(temp1 != null && temp2 != null){
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;

        }

        
    }
}