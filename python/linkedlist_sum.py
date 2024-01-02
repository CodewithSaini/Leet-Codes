from typing import Optional
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    

def print_list(head):
    list = []
    current = head
    while current:
        list.append(current.val)
        current = current.next
    print(list)


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        sum = None
        prev_carry_over = None
        sum_to_add = None
        while l1 or l2:
            carry_over = None
            x = 0
            y = 0
            if l1:
                x = l1.val
                l1 = l1.next
            if l2:
                y = l2.val
                l2 = l2.next
            current_sum = x+y
            if current_sum > 9:
                carry_over = current_sum//10
                current_sum = current_sum%10

            if prev_carry_over != None:
                current_sum += prev_carry_over
                if current_sum > 9:
                    carry_over = current_sum//10
                    current_sum = current_sum%10
            
            if sum == None:
                sum = ListNode(current_sum)
                sum_to_add = sum
                if not l1 and not l2 and carry_over != None:
                    sum.next = ListNode(carry_over)
            else:
                sum_to_add.next = ListNode(current_sum)
                sum_to_add = sum_to_add.next
                if not l1 and not l2 and carry_over != None:
                    sum_to_add.next = ListNode(carry_over)
            print(current_sum, prev_carry_over)
            prev_carry_over = carry_over
        return sum


x =  ListNode(2)
x.next = ListNode(4)
(x.next).next = ListNode(3)
#((x.next).next).next = ListNode(9)

y =  ListNode(5)
y.next = ListNode(6)
(y.next).next = ListNode(4)
#((y.next).next).next = ListNode(9)
#(((y.next).next).next).next = ListNode(9)
#((((y.next).next).next).next).next = ListNode(9)
#(((((y.next).next).next).next).next).next = ListNode(9)


sum = Solution()
sum = sum.addTwoNumbers(x, y)

print_list(sum)