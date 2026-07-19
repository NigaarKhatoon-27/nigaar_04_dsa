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
    public int getKthFromLast(Node head, int k) {
        // code here
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        if(k > length) return -1;
        temp = head;
        int find = length - k + 1;
        if(find == 1)
        {
            return head.data;
        }
        for(int i = 1;i<find;i++){
            temp = temp.next;
        }
        return temp.data;
        
    }
}