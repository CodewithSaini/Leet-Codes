#include <iostream>
#include "PalindromicSequence.h"

using namespace std;

int main() {
    PalindromicSequence pal = PalindromicSequence();
    string re = pal.longestPalindrome("ababd");
    cout << re << endl;

    return 0;
}
