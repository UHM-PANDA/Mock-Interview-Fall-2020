#include <iostream>
#include <vector>

#include "optimal_sort.hpp"

int main(int artgc, char** argv){

    std::vector<int> test = {1,2,3,5,4};

    std::cout << optimal_sort(test) << std::endl;
}