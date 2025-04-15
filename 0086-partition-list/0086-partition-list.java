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
    public ListNode append(ListNode newHead,ListNode newTail,int data){
        ListNode temp1 = new ListNode(data);
        if(newHead == null){
            newHead = temp1;
            newTail = newHead;
        }        
        else{
            newTail.next = temp1;
            newTail = temp1;
        }
        return newHead;
    }
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode newHead = null;
        ListNode newTail = null;
        while(temp!=null){
            if(temp.val < x){
                ListNode temp1 = new ListNode(temp.val);
                if(newHead == null){
                    newHead = temp1;
                    newTail = newHead;
                }        
                else{
                    newTail.next = temp1;
                    newTail = temp1;
                }
            }
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            if(temp.val >= x){
                ListNode temp1 = new ListNode(temp.val);
                if(newHead == null){
                    newHead = temp1;
                    newTail = newHead;
                }        
                else{
                    newTail.next = temp1;
                    newTail = temp1;
                }
            }
            temp = temp.next;
        }
        return newHead;
    }
}