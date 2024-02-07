from typing import Optional, List
class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


one = TreeNode(1, None, None)
two = TreeNode(2, None, None)
four = TreeNode(4, None, None)
five = TreeNode(5, one, None)
three = TreeNode(3, four, five)

root = TreeNode(3, two, three)

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root == None:
            return []
        queue = []
        queue.append(root)
        result = []
        while True:
            level = len(queue) 
            if level == 0:
                break
            temp = []
            while level > 0:
                element = queue.pop(0)
                temp.append(element.val)
                if element.left != None:
                    queue.append(element.left)
                if element.right != None:
                    queue.append(element.right)
                level = level - 1 
            result.append(temp)
    
        return result

sol = Solution()
re = sol.levelOrder(root)
print(re)