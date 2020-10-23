#include <vector>
#include <algorithm>

#include "median.hpp"

float median_brute(std::vector<int> v1, std::vector<int> v2) {
    std::vector<int> brute;

    for(int i = 0; i < v1.size(); i++) {
        brute.push_back(v1[i]);
    }

    for(int i = 0; i < v2.size(); i++) {
        brute.push_back(v2[i]);
    }

    std::sort(brute.begin(),brute.end());

    int middle = brute.size() / 2;

    if((brute.size() % 2) > 0) {
        return ( brute[middle] + brute[middle+1] ) / 2;
    }

    return brute[middle];
}


float median_dp(std::vector<int> v1, std::vector<int> v2) {
    return 0;
}