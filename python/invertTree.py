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
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root == None:
            return root
        queue = []
        queue.append(root)
        while len(queue) > 0:
            node = queue.pop(0)
            temp = node.left
            node.left = node.right
            node.right = temp

            if node.right != None:
                queue.append(node.right)
            if node.left != None:
                queue.append(node.left)
        return root
sol = Solution()
re = sol.levelOrder(root)
print(re)