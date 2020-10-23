#include<vector>
#include <map>

#include "twosum.hpp"

bool twosum(int target, std::vector<int> input){
    std::map<int,int> check;
    for(int i = 0; i < input.size(); i++){
        if(check.find(input[i]) == check.end()){
            check.insert(std::pair<int,int>(target-input[i],target));
        }
        else{
            return true;
        }
    }

    return false;
}