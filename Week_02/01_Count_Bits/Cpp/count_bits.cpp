#include "count_bits.hpp"

int count_bits_suboptimal(int input){
    int ans = 0;
    while(input){
        if(input & 1){
            ans++;
        }
        input >>= 1;
    }
}


int count_bits_optimal(int input){
    int ans = 0;
    while(input){
        ans++;
        input &= input - 1;
    }
    return ans;
}