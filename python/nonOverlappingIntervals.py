from typing import Optional, List

class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        min_range = intervals[0][0]
        max_range = intervals[0][1]
        count = 0
        for i in range(1, len(intervals)):
            first, second = intervals[i]
            if not first <= min_range and not second <= max_range:
                min_range = min(min_range, first)
                max_range = max(max_range, second)
            else:
                count += 1
        return count


sol = Solution()
x = sol.eraseOverlapIntervals([[1, 2],[2, 3]])
print(x)


        