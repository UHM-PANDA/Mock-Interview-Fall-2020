#include <vector>

#include "fib.hpp"

int fib_classic(int n){
    if(n <= 1){
        return n;
    }

    return fib_classic(n-1) + fib_classic(n-2); 
}

int fib_dp_general(int n){
    std::vector<int> mem(n+2);
    mem[0] = 0;
    mem[1] = 1;
    for(int i = 2; i <=n ; i++){
        mem[i] = mem[i-1] + mem[i-2];
    }
    return mem[n];
}