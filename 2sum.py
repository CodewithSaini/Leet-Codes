from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        Index = {}
        for i, val in enumerate(nums):
            if target - val in Index:
                return [Index[target - val], i]
            Index[val] = i
        return []
    


sol = Solution()

print(sol.twoSum([3, 2, 4, 5, 7, 8, 9], 6))