/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        Node preSlow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            preSlow = slow;
            slow = slow.next;
        }
        preSlow.next = slow.next;
        return head;
        
    }
}