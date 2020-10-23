#include "remove_kth.hpp"

Node* remove_kth_element_suboptimal(Node* head, int k){
    unsigned int size = 1;
    if(head == NULL){
        return NULL;
    }

    Node* runner = head->next;

    while(runner != NULL){
        size++;
        runner = runner->next;
    }

    int index = size - k;

    runner = head;
    while(index > 2){
        runner = runner->next;
        index--;
    }

    Node* temp = runner->next;
    runner->next = runner->next->next;

    return head;
}

Node* remove_kth_element_optimal(Node* head, int k){

    Node* runner_back = head;
    Node* runner_front = head;

    while((k--) >= 0){
        runner_front = runner_front->next;
    }

    while(runner_front != NULL){
        runner_back = runner_back->next;
        runner_front = runner_front->next;
    }
    runner_back->next = runner_back->next->next;

    return head;

}