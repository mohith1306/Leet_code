/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head == NULL || head->next == NULL) return head;
    struct Node* temp = reverseList(head->next);
    head->next->next = head;
    head->next = NULL;
    return temp;
}