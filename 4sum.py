from typing import List
class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        arr = []
        nums.sort()
        for i, val1 in enumerate(nums):
            for j, val2 in enumerate(nums):
                if i >= j or val2 == nums[i-1] or val1 == nums[i-1] and i > 0:
                    continue
                left = j+1
                right = len(nums)-1
                while left < right:
                    sum = val1 + val2 + nums[left] + nums[right]
                    if sum > target:
                        right -= 1
                    elif sum < target:
                        left += 1
                    else:
                        arr.append([val1, val2, nums[left], nums[right]])
                        left += 1
                        
        return arr





sol = Solution()

print(sol.fourSum([-2, -1, 0, 0, 1, 2], 8))

num = [-2, -1, 0, 0, 1, 2]