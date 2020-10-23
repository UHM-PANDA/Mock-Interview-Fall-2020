#include <iostream>

#include "count_bits.hpp"

int main(int argc, char** argv){

    std::cout << "1: " << count_bits_optimal(1) << std::endl;
    std::cout << "2: " << count_bits_optimal(2) << std::endl;
    std::cout << "7: " << count_bits_optimal(7) << std::endl;
    std::cout << "33: " << count_bits_optimal(33) << std::endl;

    return 0;
}