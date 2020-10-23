#include <vector>

#include "swap_bits.hpp"

int swap_bits_optimal(int input, int i, int k){
    int ans = input;

    int first = input & (1 << i);
    int second = input & (1 << k);

    if((first == second) || (first != 0 && second != 0)){
        return ans;
    }

    int mask = (1 << i) || (1 << k);

    ans = input ^ mask;
    return ans;
}

int swap_bits_suboptimal(int input, int i, int k){
    int ans = 0;
    std::vector<bool> num; 

    for(int j = 0; j < 64; j++){
        auto it = num.insert(num.begin(),(input & 1));
        input >>= 1;    
    }

    if(num[i] == num[k]){
        return ans;
    }

    bool temp = num[i];

    num[i] = num[k];
    num[k] = temp;

    for(int j = num.length() - 1; j >= 0; j--){
        ans |= num[j];
        ans <<= 1;
    }

    return ans;
}