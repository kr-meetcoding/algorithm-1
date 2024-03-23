from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current, prev = head, None

        while current:
            next_temp, current.next = current.next, prev  # 위치 변경
            prev, current = current, next_temp  # 다음 node setting

        return prev
# 27ms,17.8mb

# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         stack = []
#         current = head
#
#         while current:
#             stack.append(current)
#             current = current.next
#
#         if not stack:
#             return None
#
#         new_head = stack.pop()
#         current = new_head
#         while stack:
#             current.next = stack.pop()
#             current = current.next
#         current.next = None  # 마지막 노드의 next를 None으로 설정
#
#         return new_head

# 41ms, 17.6mb