#include "primes.hpp"

std::vector<int> enumerate_primes(int n) {
    std::vector<bool> check(n+1,1);
    std::vector<int> ans;

    check[0] = 0;
    check[1] = 0;

    for (int i = 2; i < check.size(); i++) {
        if(check[i]) {
            for(int j = 2; j < check.size(); j++) {
                int m = i*j;
                if(m < check.size()) {
                    check[m] = 0;
                }
            }
        }
    }

    for(int i = 0; i < check.size(); i++) {
        if(check[i]) {
            ans.push_back(i);
        }
    }

    return ans;
}