#ifndef MERGE_HPP
#define MERGE_HPP

class Node{
    public:
        int val;
        Node* next;

        Node(): val(0), next(NULL) { } ;
        Node(int value): val(value), next(NULL) { };
        Node(int value, Node* nex): val(value), next(nex) { };
};


Node* merge_ll_cheeky(Node* L1, Node* L2);


#endif