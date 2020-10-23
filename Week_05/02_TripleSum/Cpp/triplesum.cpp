#include <vector>
#include <map>

#include "triplesum.hpp"

bool triplesum(int target, std::vector<int> input){
    for(int i = 0; i < input.size(); i++){
        std::vector<int> temp;
        for(int j = i + 1; i < input.size(); i++){ temp.push_back(input[j]); }
        if(twosum(target-input[i],temp)){
            return true;
        }
    }
    return false;
}

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