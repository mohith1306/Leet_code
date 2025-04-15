#include <stdlib.h>

struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int len = 0;
    struct ListNode *temp = head;
    while (temp != NULL) {
        len++;
        temp = temp->next;
    }

    if (n == len) {
        struct ListNode* newHead = head->next;
        free(head);
        return newHead;
    }
    struct ListNode* p = head;
    struct ListNode* q = head->next;
    for (int i = 1; i < len - n; i++) {
        p = p->next;
        q = q->next;
    }

    p->next = q->next;
    free(q);
    
    return head;
}