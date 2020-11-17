#include <stack>

#include "formLinkedListFromBTree.hpp"

LLNode* form_linked_list_from_BTree(BTNode* head) {
    std::stack<BTNode*> s; 
    BTNode *curr = head; 
    LLNode* ans = nullptr;
    LLNode* runner = nullptr;
    while (curr != NULL || s.empty() == false) 
    { 
        /* Reach the left most Node of the 
           curr Node */
        while (curr !=  NULL) 
        { 
            /* place pointer to a tree node on 
               the stack before traversing 
              the node's left subtree */
            s.push(curr); 
            curr = curr->left; 
        } 
  
        /* Current must be NULL at this point */
        curr = s.top(); 
        s.pop(); 

        if(curr->left == nullptr && curr->right == nullptr) {
            if(ans == nullptr) {
                ans = new LLNode(curr->val);
                runner = ans;
            }
            else {
                runner->next = new LLNode(curr->val);
                runner = runner->next;
            }
        }

        /* we have visited the node and its 
           left subtree.  Now, it's right 
           subtree's turn */
        curr = curr->right; 
  
    } /* end of while */

    return ans;
}