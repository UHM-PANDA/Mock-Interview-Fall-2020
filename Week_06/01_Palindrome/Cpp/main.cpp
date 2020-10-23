#include <iostream>
#include <string>

#include "rpn.hpp"

int main(int argc, char** argv){

    std::string temp = "53-4+5*";

    std::cout << rpn(temp) << std::endl;

    return 0;
}