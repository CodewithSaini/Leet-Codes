class Solution:
    def romanToInt(self, s: str) -> int:
        num = 0
        symbolToValue = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        for i in range(len(s)):
            if i < len(s) - 1:
                if s[i] == "I" and (s[i+1] == "V" or s[i+1] == "X"):
                    num -= 1
                elif s[i] == "X" and (s[i+1] == "C" or s[i+1] == "L"):
                    num -= 10
                elif s[i] == "C" and (s[i+1] == "D" or s[i+1] == "M"):
                    num -= 100
                else:
                    num += symbolToValue[s[i]]
            elif i == len(s)-1:
                num += symbolToValue[s[i]]
        return num



sol = Solution()
print(sol.romanToInt("LVIII"))