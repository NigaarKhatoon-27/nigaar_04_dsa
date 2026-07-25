/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;
        Node curr = head;
        while(curr != null){
            if(curr.data % 2 == 0){
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }
            else{
                
                if(oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }
                else{
                    oddTail.next = curr;
                    oddTail = curr;
                }
                
            }
            curr = curr.next;
        }
        if(evenHead == null) return oddHead;
        if(oddHead == null) return evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
        
        return evenHead;
        
    }
}