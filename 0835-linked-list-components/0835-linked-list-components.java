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
import java.util.*;

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }

        int count = 0;
        ListNode first = head;
        ListNode second = head;

        while (second != null) {
            if (set.contains(second.val)) {
                second = second.next;
            } else {
                if (first != second) {
                    count++;
                }
                second = second.next;
                first = second;
            }
        }
        if (first != second) {
            count++;
        }

        return count;
    }
}
