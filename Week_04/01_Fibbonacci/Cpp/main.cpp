#include <iostream>

#include "fib.hpp"

int main(int argc, char** argv){

    std::cout << fib_classic(100) << std::endl;
    std::cout << fib_dp_general(100) << std::endl;

    return 0;
}