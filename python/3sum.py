from typing import List
from collections import Counter
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        arr = []
        nums.sort()
        for i, val in enumerate(nums):
            if val == nums[i-1] and i > 0:
                continue
            left = i+1
            right = len(nums) -1
            while left < right:
                sum = val + nums[left] + nums[right]
                if sum < 0:
                    left += 1
                elif sum > 0:
                    right -= 1
                else:
                    arr.append([val, nums[left], nums[right]])
                    left += 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1                              
        return arr







sol = Solution()

print(sol.threeSum([-2, 0, 1, 1, 2]))
