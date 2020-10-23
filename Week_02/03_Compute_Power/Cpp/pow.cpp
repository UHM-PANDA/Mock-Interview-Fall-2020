#include "pow.hpp"

int pow_brute(int x, int y){
    int ans = x;
    if(y == 1){
        return ans;
    }

    if(y == 0){
        return 1;
    }

    while(y > 1){
        ans *= x;
        y--;
    }

    return ans;
}