#include <vector>

#include "merge.hpp"


Node* merge_ll_cheeky(Node* L1, Node* L2){

    if(L1 == NULL){
        return L2;
    }

    if(L2 == NULL){
        return L1;
    }

    std::vector<int> ansv;

    Node* L1runner = L1;
    Node* L2runner = L2;

    while((L1runner != NULL) && (L2runner != NULL))){
        if(L1runner->val < L2runner->val){
            ansv.push_back(L1runner->val);
            L1runner = L1runner->next;
        }

        if(L1runner->val > L2runner->val){
            ansv.push_back(L2runner->val);
            L2runner = L2runner->next;
        }

        if(L1runner->val == L2runner->val){
            ansv.push_back(L1runner->val);
            ansv.push_back(L2runner->val);
            L1runner = L1runner->next;
            L2runner = L2runner->next;
        }
    }

    Node* legrunner = NULL;

    if(L1runner == NULL){
        legrunner = L2runner;
    }

    if(L2runner == NULL){
        legrunner = L2runner;
    }

    while(legrunner != NULL){
        ansv.push_back(legrunner->val);
        legrunner = legrunner->next;
    }

    Node* ans = new Node(ansv[0]);
    legrunner = ans;

    for(int i = 1; i < ansv.length(); i++){
        legrunner->next = new Node(ansv[i]);
        legrunner = legrunner->next;
    }

    return ans;
}