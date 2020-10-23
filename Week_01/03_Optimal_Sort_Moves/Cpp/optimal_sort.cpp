#include <vector>
#include <alorithm>

int optimal_sort(std::vector<int> input){
    std::vector<int> temp (input);
    std::sort(temp.begin(),temp.end());
    int ans = 0;
    for(int i = 0; i < input.size(); i++){
        if(temp[i] != input[i]){
            ans++;
        }
    }
    return ans;
}