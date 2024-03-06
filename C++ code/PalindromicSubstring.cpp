//
// Created by Vikas Saini on 2024-03-05.
//

#include "PalindromicSubstring.h"


int PalindromicSubstring::countSubstrings(std::string s) {
    int result = 0;
    for (int i=0; i<s.length(); i++){
        int j = i;
        int k = i;
        while (0<=j<s.length() && 0<=k<s.length() && s[j] == s[k]){
            result++;
            j--;
            k++;
        }
        j = i;
        k = i+1;
        while (0<=j<s.length() && 0<=k<s.length() && s[j] == s[k]){
            result++;
            j--;
            k++;
        }
    }
    return result;
}
