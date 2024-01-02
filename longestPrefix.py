from typing import List
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str: 
        j = 0
        sol = ""
        while j!= -1:
            counter = 0
            for i in range(len(strs)):
                if len(strs[i]) > j and len(strs[0]) > j:
                    if strs[i][j] == strs[0][j]:
                        counter += 1
                else:
                    continue
            if counter == len(strs):
                sol += strs[0][j]
            else:
                j  = -1
                break
            j = j + 1
        return sol
    


sol = Solution()

print(sol.longestCommonPrefix(["flower","flow","flight"]))