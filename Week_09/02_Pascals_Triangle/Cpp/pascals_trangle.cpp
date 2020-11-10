#include <vector>

#include "pascals_triangle.hpp"

std::vector<std::vector<int>> pascals_triangle(int height) {
    std::vector<std::vector<int>> ans;

    for(int i = 0; i < height; i++) {
        std::vector<int> temp;

        for(int j = 0; j <=i; j++) {
            temp.emplace_back(0 < j && j < i ? ans.back()[j-1] + ans.back()[j] : 1);
        }

        ans.emplace_back(temp);
    }

    return ans;
}