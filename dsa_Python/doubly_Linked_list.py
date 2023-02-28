class node:
    def __init__(self, data = None, prev = None, next = None):
        self.data = data
        self.prev = prev
        self.next = next

class doubly_linked_list:
    def __init__(self):    
        self.head = None
        self.tail = None

    def insert_at_front(self, data):
        self.head = node(data = data, next = self.head)
        if self.head.next != None:
            self.head.next.prev = self.head
        
    def is_empty(self):
        return self.head == None
        
    def insert_at_end(self, data):
        if not self.head:
            self.head = node(data = data)
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data = data, prev = curr)
    
    def delete_node(self, key):
        curr = self.head
        while curr and curr.data != key:
            curr = curr.next
        if curr.prev == None:
            self.head = curr.next
            curr.next.prev = None
            curr.next = None
        elif curr:
            curr.prev.next = curr.next
            curr.next.prev = curr.prev
            curr.next = None
            curr.prev = None
            
    def get_last_node(self):
        temp = self.head
        while temp.next != None:
            temp = temp.next
        self.tail = temp
        return temp.data
        
    def print_list(self):
        nde = self.head
        while nde != None:
            print(nde.data, end = " -> ")
            nde = nde.next
        print()
        nde = self.tail
        while nde != None:
            print(nde.data, end = " -> ")
            nde = nde.prev
        print("\n")

        
ll1 = doubly_linked_list()
ll1.insert_at_front(1)
ll1.insert_at_front(2)
ll1.insert_at_front(3)
ll1.insert_at_end(0)

print(ll1.head)
print(ll1.head.prev)
print(ll1.head.next)
print(ll1.head.next.prev)
print(ll1.head.next.next)
print(ll1.head.next.next.prev)
print(ll1.head.next.next.next)
print(ll1.head.next.next.next.prev)
print(ll1.head.next.next.next.next)


print(ll1.is_empty())
print(ll1.get_last_node())

ll1.print_list()

ll1.delete_node(2)

ll1.print_list()
