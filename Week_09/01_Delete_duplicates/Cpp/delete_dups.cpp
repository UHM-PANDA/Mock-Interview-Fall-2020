#include <vector>
#include <map>

#include "delete_dups.hpp"

std::vector<int> delete_dups(std::vector<int> input) {
    std::map<int,int> check;
    std::vector<int> ans;

    for(int i = 0; i < input.size(); i++) {
        if(check.find(input[i]) == check.end()) {
            check.insert(std::pair<int,int>(input[i],0));
        }
    }

    for (auto it : check) {
        ans.push_back(it.first);
    }

    return ans;

}