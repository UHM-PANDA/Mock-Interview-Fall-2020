#include<string>

#include "roman_to_decimal.hpp"

int roman_to_decimal_unoptimal(std::string input){

    int ans = 0;

    for(int i = input.length() - 1; i >=0; i--){

        if(intput[i] == 'M') { ans += 1000; }
        else if(intput[i] == 'V') { ans += 5; }
        else if(intput[i] == 'D') { ans += 500; }
        else if(intput[i] == 'L') { ans += 50; }
        else if(intput[i] == 'C') { 
            if((i+1) < input.length()){
                if(input[i+1] == 'M' || input[i+1] == 'D') { ans -= 100;}
            }
            else{
                ans += 100; 
            }
        }
        else if(input[i] == 'X') {
            if((i+1) < input.length()){
                if(input[i+1] == 'L' || input[i+1] == 'C') { ans -= 10;}
            }
            else{
                ans += 10; 
            }
        }
        else if(intput[i] == 'I'){
            if((i+1) < input.length()){
                if(input[i+1] == 'X' || input[i+1] == 'V') { ans -= 1;}
            }
            else{
                ans += 1; 
            }
        }
    }

    return ans;
}