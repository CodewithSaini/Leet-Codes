
from queue import LifoQueue
class Solution:
    def isValid(self, s: str) -> bool:
        stack = LifoQueue()
        if len(s)%2 ==1:
            return False
        else:
            for char in s:
                if char == '(' or char == '[' or char == '{':
                    stack.put(char)
                else:
                    on_stack = stack.get()
                    if on_stack == "(" and char == ')':
                        continue
                    elif on_stack == "{" and char == '}':
                        continue
                    elif on_stack == "[" and char == ']':
                        continue
                    else:
                        return False
            return True




sol = Solution()
print(sol.isValid("()[]]"))