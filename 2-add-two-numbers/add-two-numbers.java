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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=new ListNode(0);
        ListNode temp=head;
        int sum =0;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int val1 = (l1!=null)?l1.val:0;
            int val2 = (l2!=null)?l2.val:0; 
            sum = val1 + val2+carry;
            carry=sum/10;
            ListNode a = new ListNode(sum%10);
            temp.next=a;
            temp=temp.next;
            // temp1=temp1.next;
            // temp2=temp2.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        return head.next;
    }
}