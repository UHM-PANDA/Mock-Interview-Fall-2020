#include <unordered_set>
#include <stdexcept>

#include "collatz.hpp"

bool TestCollatz(int n) {
    std::unordered_set<long long> verified;

    for(int i = 3; i <= n; i+=2) {
        std::unordered_set<long long> curr_sequence;
        long long test_i = i;

        while(test_i >= i) {
            if(!curr_sequence.emplace(test_i).second) {
                return false;
            }

            if(test_i %2) {
                if(!verified.emplace(test_i).second) {
                    break;
                }

                long long next_test = 3 * test_i + 1;

                if(next_test <= test_i) {
                    throw std::overflow_error("Collatz Overflow!");
                }

                test_i = next_test;
            }

            else{
                test_i /= 2;
            }
        }
    }

    return true;
}