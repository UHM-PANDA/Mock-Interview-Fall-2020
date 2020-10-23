#include <string>

std::string decimal_to_roman_suboptimal(int input){
    std::string ans = "";
    int multiplier = 1;

    while(intput > 0){
        int right_most_number = input % 10;
        input /= 10;
        ans.insert(0,get_roman_conversion(right_most_number,multiplier)));
    }

    return ans;
}

std::string get_roman_conversion(int r, int mul){
    std::string ans = "";
    if(mul == 1){
        if(r == 4){
            ans.push_back('I');
            ans.push_back('V');
            return ans;
        }
        if(r == 9){
            ans.push_back('I');
            ans.push_back('X');
            return ans;
        }
        if(r < 5){
            for(int i = r; i > 0; i--){
                ans.push_back('I');
            }
            return ans;
        }
        ans.push_back('V');
        r -= 5;
        for(int i = r; i > 0; i--){
            ans.push_back('I');
        }
    }

    if(mul == 10){
        if(r == 4){
            ans.push_back('X');
            ans.push_back('L');
            return ans;
        }
        if(r == 9){
            ans.push_back('X');
            ans.push_back('C');
            return ans;
        }
        if(r < 5){
            for(int i = r; i > 0; i--){
                ans.push_back('X');
            }
            return ans;
        }
        ans.push_back('C');
        r -= 5;
        for(int i = r; i > 0; i--){
            ans.push_back('X');
        }
    }

     if(mul == 100){
        if(r == 4){
            ans.push_back('C');
            ans.push_back('D');
            return ans;
        }
        if(r == 9){
            ans.push_back('C');
            ans.push_back('M');
            return ans;
        }
        if(r < 5){
            for(int i = r; i > 0; i--){
                ans.push_back('C');
            }
            return ans;
        }
        ans.push_back('D');
        r -= 5;
        for(int i = r; i > 0; i--){
            ans.push_back('C');
        }
    }

    if(mul == 1000){
        for(int i = r; i > 0; i--){
            ans.push_back('M');
        }
    }
    return ans;
}