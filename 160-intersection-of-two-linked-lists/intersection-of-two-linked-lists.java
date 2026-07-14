/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int count1=0;
        int count2=0;
        while(tempA != null){
            count1++;
            tempA = tempA.next;
        }
        while(tempB != null){
            count2++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(count1 > count2){
            for(int i=0;i<count1-count2;i++){
            tempA= tempA.next;
            }
        }
        else if(count2 > count1){
            for(int i=0;i<count2-count1;i++){
            tempB= tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;

        }
        return tempA;
    }
}