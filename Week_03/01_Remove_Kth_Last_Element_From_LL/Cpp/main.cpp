#include <iostream>

#include "remove_kth.hpp"

int main(int artgc, char** argv){
    Node* head = new Node(1);
    Node* runner = head;

    for(int i = 1; i < 11; i++){
        runner->next = new Node(i+1);
        runner = runner->next;
    }

    runner = head;
    std::cout << "->";
    for(; runner != NULL; runner = runner->next){
        std::cout << runner->val << "->";
    }
    std::cout << "/" << std::endl;

    Node* temp = remove_kth_element_suboptimal(head,2);
    Node* temp2 = remove_kth_element_suboptimal(head,2);

    runner = temp;
    std::cout << "->";
    for(; runner != NULL; runner = runner->next){
        std::cout << runner->val << "->";
    }
    std::cout << "/" << std::endl;

    runner = temp2;
    std::cout << "->";
    for(; runner != NULL; runner = runner->next){
        std::cout << runner->val << "->";
    }
    std::cout << "/" << std::endl;

    return 0;

}