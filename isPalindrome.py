class Solution:
    def isPalindrome(self, x: int) -> bool:
        num = str(x)
        while len(num) > 0:
            if num[0] == num[-1]:
                num = num[1:-1]
            else:
                return False
        return True



sol = Solution()

print(sol.isPalindrome(202))