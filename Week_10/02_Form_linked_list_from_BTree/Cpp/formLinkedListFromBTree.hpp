#ifndef LLBTREE
#define LLBTREE

class LLNode {
    public:
        int val;
        LLNode* next;

        LLNode(): val(0),next(nullptr) { }
        LLNode(int v): val(v),next(nullptr) { }
        LLNode(int v, LLNode* n): val(v),next(n) { } 
};

class BTNode {
    public:
        int val;
        BTNode* left;
        BTNode* right;

        BTNode(): val(0),left(nullptr),right(nullptr) { }
        BTNode(int v): val(v),left(nullptr),right(nullptr) { }
        BTNode(int v, BTNode* l, BTNode* r): val(v),left(l),right(r) { } 
};

LLNode* form_linked_list_from_BTree(BTNode* head);

#endif