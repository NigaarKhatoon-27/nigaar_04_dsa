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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int m =0;
        while(temp!=null){
            m++;
            temp=temp.next;
        }
        int beg = m-n+1;
             if (beg == 1) {
            return head.next;
        }
        temp = head;
        for(int i=0;i<beg-2;i++){
            temp = temp.next;
        }
        if(temp.next != null)
        temp.next = temp.next.next;
return head;
    }
}