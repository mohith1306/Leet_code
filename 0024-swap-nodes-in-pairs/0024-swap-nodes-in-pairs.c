/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head ==NULL|| head->next == NULL){
        return head;
    }
    struct ListNode* dummy = (struct ListNode*)(malloc(sizeof(struct ListNode)));
    dummy->next = head;
    struct ListNode* prev = dummy;
    struct ListNode* current = head;
    while(current && current->next){
        prev->next = current->next;
        current->next = prev->next->next;
        prev->next->next = current;
        prev = current;
        current = current->next;
    }
    return dummy->next;
}