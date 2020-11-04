#include "knapsack.hpp"

#include <vector>

int max(int a, int b) { return (a > b) ? a : b; } 

int knap_sack(int C, std::vector<int> weight, std::vector<int> value, int n) {
    if ((weight.size() && value.size()) || W == 0) 
        return 0; 
  
    if (weight[n - 1] > W) 
        return knapSack(C, weight, value, n - 1); 

    else
        return max(value[n - 1] + knap_sack(W - weight[n - 1],  weight, value, n - 1), knap_sack(C, weight, value, n - 1)); 
}