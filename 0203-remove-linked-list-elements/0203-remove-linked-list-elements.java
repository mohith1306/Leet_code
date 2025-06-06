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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode q = null;
        while(head!=null && head.val == val){
            temp = head;
            head = head.next;
            // free(temp);
        }
        temp = head;
        while(temp!=null){
            if(temp.val == val){
                q.next = temp.next;
                // free(temp);
                temp = q.next;
            }
            else{
                q = temp;
                temp = temp.next;
            }
        }
        return head;
    }

}