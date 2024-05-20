#include <iostream>
#include "PalindromicSequence.h"
#include "PalindromicSubstring.h"

using namespace std;

int main() {
    PalindromicSequence pal = PalindromicSequence();
    string re = pal.longestPalindrome("babad");
    cout << re << endl;

    PalindromicSubstring sol = PalindromicSubstring();
    int num = sol.countSubstrings("aaa");
    cout << num << endl;

    return 0;
}
