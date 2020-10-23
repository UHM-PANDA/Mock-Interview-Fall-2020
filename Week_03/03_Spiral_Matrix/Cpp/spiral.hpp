#ifndef SPIRAL_HPP
#define SPIRAL_HPP

#include<vector>

void spiral_matrix(std::vector<std::vector<int>> input);
void spiral_matrix_help(std::vector<std::vector<int>> input,bool up, bool down, bool left, bool right, int start, int end);

#endif