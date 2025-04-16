/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
        struct ListNode* temp = head;
        int count = 0;
        while(temp!=NULL){
            temp = temp->next;
            count++;
        }
        temp = head;
        int arr[count];
        for(int i=0;i<count;i++){
            arr[i] = temp->val;
            temp = temp->next;    
        }
        for(int i=0;i<count;i++){
            if(arr[i] != arr[count-i-1]) return false;
        }
        return true;
}