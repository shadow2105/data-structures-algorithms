from collections import deque

class queue:
    def __init__(self, size):
        self.items = deque()
        self.size = size

    def is_empty(self):
        return self.items == []

    def enqueue(self, item):
        if len(self.items) < self.size:
            self.items.appendleft(item)
        else:
            print("Queue is FULL")

    def dequeue(self):
        if len(self.items) > 0:
            self.items.pop()
        else:
            print("Queue is EMPTY")
        
    def queue_size(self):
        return len(self.items)
        
    def print_queue(self):
        print(self.items)


que = queue(3)
que.dequeue()

que.enqueue("a")
que.enqueue("b")
que.enqueue("d")
que.print_queue()
print(que.is_empty())
print(que.queue_size())

que.enqueue("c")

que.dequeue()
que.print_queue()

que.enqueue("c")
que.print_queue()

print()


string = "12345"

que1 = queue(50)
que1.print_queue()
for p in string:
    que1.enqueue("print" + p)
    que1.print_queue()

for n in range(que1.queue_size()):
    que1.dequeue()
    que1.print_queue()
    