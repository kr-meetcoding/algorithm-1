import collections


class MyCircularQueue:

    def __init__(self, k: int):
        self.q = collections.deque()
        self.full = k

    def enQueue(self, value: int) -> bool:
        if self.isFull():
            return False
        else:
            self.q.append(value)
            return True

    def deQueue(self) -> bool:
        if self.isEmpty():
            return False
        else:
            self.q.popleft()
            return True

    def Front(self) -> int:
        return -1 if self.isEmpty() else self.q[0]

    def Rear(self) -> int:
        return -1 if self.isEmpty() else self.q[-1]

    def isEmpty(self) -> bool:
        return len(self.q) == 0

    def isFull(self) -> bool:
        return len(self.q) == self.full

# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()