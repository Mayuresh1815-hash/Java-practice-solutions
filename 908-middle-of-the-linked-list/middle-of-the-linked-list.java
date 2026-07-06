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
    public ListNode middleNode(ListNode head) {
        ListNode n= head;
        int size=0;
        while(n!=null){
            size++;
            n=n.next;
        }

        int mid=size/2;
        n=head;
        for(int i=0;i<mid;i++){
            n=n.next;
        }
        return n;
    
    }
}



//      ListNode slow=head;
//         ListNode fast=head;

//         while(fast.next!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }

//         return slow;