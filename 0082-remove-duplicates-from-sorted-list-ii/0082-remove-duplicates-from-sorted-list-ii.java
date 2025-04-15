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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!= null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        ListNode newHead = null;
        ListNode newTail = null;
        temp = head;
        while(temp!=null){
            if(map.get(temp.val) == 1){
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