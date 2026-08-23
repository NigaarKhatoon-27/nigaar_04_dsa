# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        def reverselist(node):
            prev = None
            curr = node
            while curr:
                nextnode = curr.next
                curr.next= prev
                prev = curr
                curr = nextnode
            return prev
        def getkthnode(node , k):
            curr = node
            for i in range(k-1):
                if not curr:
                    return None
                curr = curr.next
            return curr
        if not head or k == 1:
            return head
        dummy = ListNode(0)
        dummy.next = head
        prevgrouptail = dummy
        currentgrouphead = head
        while(currentgrouphead):
            kthnode = getkthnode(currentgrouphead , k)
            if not kthnode:
                break
            nextgrouphead = kthnode.next
            kthnode.next = None
            newheadofreversedgroup = reverselist(currentgrouphead)
            prevgrouptail.next = newheadofreversedgroup
            currentgrouphead.next = nextgrouphead
            prevgrouptail = currentgrouphead
            currentgrouphead = nextgrouphead
        return dummy.next
        