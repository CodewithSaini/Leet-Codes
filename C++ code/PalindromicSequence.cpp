//
// Created by Vikas Saini on 2024-03-01.
//


#include "PalindromicSequence.h"


string PalindromicSequence::longestPalindrome(std::string s) {
    string result = "";
    if (s.size() <= 1){
        return s;
    }
    for (int i=1; i<s.size(); i++){
        int low = i;
        int high = i;
        while (s[low] == s[high]){
            low--;
            high++;
            if (low < 0 || high == s.size()){
                break;
            }
        }
        string palindrome = s.substr(low+1, high);
        if (palindrome.size() > result.size()){
            result = palindrome;
        }

        low = i-1;
        high = i;
        while (s[low] == s[high]){
            low--;
            high++;
            if (low < 0 || high == s.size()){
                break;
            }
        }
        palindrome = s.substr(low+1, high);
        if (palindrome.size() > result.size()){
            result = palindrome;
        }
    }
    return result;
}

