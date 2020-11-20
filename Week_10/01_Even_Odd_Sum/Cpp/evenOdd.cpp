#include "evenOdd.hpp"

int evenOddSum(int input) {
    if(input % 2) {
        return -1;
    }

    if (input % 4) {
        return 1;
    }

    return 0;
}

// even odd => odd
// odd even => odd 

// even odd even odd => even 
// odd even odd even => even 

// even odd even => odd  
// odd even odd => even 

// even odd even odd even => even  
// odd even odd even odd => odd 

// even odd even odd even odd => odd 
// odd even odd even odd even => odd 

// even odd even odd even odd even odd
// odd even odd even odd even odd even