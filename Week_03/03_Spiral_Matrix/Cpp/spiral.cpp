#include <iostream>

#include "spiral.hpp"

void spiral_matrix(std::vector<std::vector<int>> input){
    bool up = 0;
    bool down = 0;
    bool left = 0;
    bool right = 1;
    spiral_matrix_help(input,up,down,left,right,0,(input[0].length()-1));
}

void spiral_matrix_help(std::vector<std::vector<int>> input,bool up, bool down, bool left, bool right, int start, int end){
    if(input.empty()){
        return;
    }

    if(right){
        for(int i = start; i <= end; i++){
            std::cout << input[0][i]  << " ";
        }
        input.erase(input.begin());
        spiral_matrix_help(input,0,1,0,0,(input[0].size()-1),(input.size()-1));
    }

    if(down){
        for(int i = 0; i <= end; i++){
            std::cout << input[i][end] << " ";
        }

        for(int i = 0; i < input.size(); i++){
            input[i].pop_back();
        }
        spiral_matrix_help(input,0,0,1,0,(input[(input.size()-1)].size()-1),0);
    }

    if(left){
        for(int i = start; i >= 0; i--){
            std::cout << input[start][i] << " ";
        }
        input.pop_back();
        spiral_matrix_help(input,1,0,0,0,(input.size()-1),0);
    }
    if(up){
        for(int i = start; i >= 0; i--){
            std::cout << input[i][0] << " ";
        }
        for(int i = 0; i < input.size(); i++){
            input[i].erase(input[i].begin());
        }
        spiral_matrix_help(input,0,0,0,1,0,(input[0].length()-1))
    }

    return;
}