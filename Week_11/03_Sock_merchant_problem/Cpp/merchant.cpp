#include <map>

#include "merchant.hpp"

int sock_merchant(std::vector<int> n) { 
    std::map<int,int> check;
    int ans = 0;

    for(int i = 0; i < n.size(); i++ ) {
        auto it = check.find(n[i]);
        if(it == check.end()) {
            check.insert(std::pair<int,int>(n[i],0));
        }

        else {
            ans++;
            check.erase(it);
        }
    }

    return ans;

}