#include <string>
#include <stack>
#include <sstream>

#include "rpn.hpp"

int rpn(std::string input) {
    std::stringstream convert;
    std::stack<int> calculate;

    for (int i = 0; i < input.size(); i++) {
        if (input[i] == '+') {
            int temp1 = stack.top(); stack.pop();
            int temp2 = stack.top(); stack.pop();
            stack.push(temp2+temp1);
        }

        else if (input[i] == '-') {
            int temp1 = stack.top(); stack.pop();
            int temp2 = stack.top(); stack.pop();
            stack.push(temp2-temp1);
        }

        else if (input[i] == '*') {
            int temp1 = stack.top(); stack.pop();
            int temp2 = stack.top(); stack.pop();
            stack.push(temp2*temp1);
        }

        if (input[i] == '/') {
            int temp1 = stack.top(); stack.pop();
            int temp2 = stack.top(); stack.pop();
            stack.push(temp2/temp1);
        }

        else {
            convert << input[i];
            int temp;
            convert  >> temp;
            calculate.push(temp);
        }

    }

    return calculate.top();

}