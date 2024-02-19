from typing import Optional;

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root == None: 
            return 0
        queue = []
        queue.append(root)
        maxDepth = -1

        while True:
            noOfChild = len(queue)
            if noOfChild == 0:
                break
            
            while noOfChild > 0:
                current: TreeNode = queue.pop(0)
                if current.left != None:
                    queue.append(current.left)
                if current.right != None:
                    queue.append(current.right)
                noOfChild = noOfChild - 1
            maxDepth = maxDepth +1
        return maxDepth


def pre_order_traversal(root):
    if root == None:
        return None
    print(root.val, end="->")
    pre_order_traversal(root.left)
    pre_order_traversal(root.right)



one = TreeNode(1, None, None)
two = TreeNode(2, None, None)
four = TreeNode(4, None, None)
five = TreeNode(5, one, None)
three = TreeNode(3, four, five)

root = TreeNode(3, two, three)

sol = Solution()
depth: int = sol.maxDepth(root)

print(f"Tree Depth: {depth}")

pre_order_traversal(root)