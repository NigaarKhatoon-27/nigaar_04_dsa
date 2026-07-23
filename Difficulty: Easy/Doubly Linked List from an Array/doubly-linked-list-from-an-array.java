/* class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
} */

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
       Node curr = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            curr.next = temp;
            temp.prev = curr;
            curr = temp;
            
        }
        return head;
    }
}