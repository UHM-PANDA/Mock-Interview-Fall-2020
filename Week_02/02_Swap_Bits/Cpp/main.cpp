#include <iostream>

#include "swap_bits.hpp"

int main(int argc, char** argv){

    std::cout << swap_bits_suboptimal(2,1,4) << std::endl;
    std::cout << swap_bits_optimal(2,1,4) << std::endl;

    retrurn 0;
}