#ifndef REMOVE_KTH
#define REMOVE_KTH

class Node {
    public:
        int val;
        Node* next;

        Node(): val(0), next(NULL) { };
        Node(int value): val(value), next(NULL) { };
        Node(int value, Node* nex): val(value), next(nex) { };
};


Node* remove_kth_element_suboptimal(Node* head, int k);
Node* remove_kth_element_optimal(Node* head, int k);

#endif