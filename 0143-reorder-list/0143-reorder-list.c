/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head) {
    if(head == NULL || head->next == NULL || head->next->next == NULL){
        return;
    }

    struct ListNode* fast = head;
    struct ListNode* slow = head;
    struct ListNode* q = NULL;
    while(fast->next !=NULL && fast->next->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    struct ListNode* curr = slow->next;
    struct ListNode* next;
    while(curr){
        next = curr->next;
        curr->next = q;
        q = curr;
        curr = next;
    }
    slow->next = NULL;
    struct ListNode *A = head, *B=q;
    while (A && B) {
        struct ListNode* A_next=A->next;
        struct ListNode* B_next=B->next;

        A->next=B;
        B->next=A_next;

        A=A_next;
        B=B_next;
    }  

}