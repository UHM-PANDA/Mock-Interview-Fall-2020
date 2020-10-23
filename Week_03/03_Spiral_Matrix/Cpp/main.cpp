#include <iostream>
#inlcude <vector>

#include "spiral.hpp"


int main(int artgc, char** argv){
    
    std::vector<std::vector<int>> in = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    spiral_matrix(in);

    return 0;
}