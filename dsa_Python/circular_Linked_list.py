class node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

class circular_linked_list:
    def __init__(self):
        self.head = None

    def insert_at_front(self, data):
        old = self.head
        self.head = node(data = data, next = self.head)
        new = self.head
        curr = new.next
        if curr is not None:
            while curr.next != old:
                curr = curr.next
            curr.next = new
        else:
            self.head.next = new      
            
    def is_empty(self):
        return self.head == None
        
    def insert_at_end(self, data):
        if not self.head:
            self.head = node(data = data)
            self.head.next = self.head
        old = self.head
        curr = old
        while curr.next != old:
            curr = curr.next
        curr.next = node(data = data)
        curr.next.next = old
        
    def get_last_node(self):
        temp = self.head
        while temp.next != self.head:
            temp = temp.next
        return (temp.data, temp)
        
    def delete_node(self, key):
        curr = self.head
        prev = None
        last = self.get_last_node()[1]
        
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev == None:
            self.head = curr.next
            curr.next = None
            last.next = self.head
        elif curr != self.head:
            prev.next = curr.next
            curr.next = None
            
    def print_list(self):
        node = self.head
        print(node.data, end = " -> ")
        node = node.next
        c = 1
        while node != self.head:
            c += 1
            print(node.data, end = " ->  ")
            node = node.next
        print()
        if self.get_last_node()[1].next == self.head:
            print("<- "*(2*c-1) + "●", end = "")
        print("\n")
    
            

ll1 = circular_linked_list()

ll1.insert_at_front(4)
ll1.insert_at_front(3)
ll1.insert_at_end(6)

print(ll1.head)
print(ll1.head.next)
print(ll1.head.next.next)
print(ll1.head.next.next.next)
print(ll1.get_last_node())

print()
ll1.print_list()


ll1.delete_node(6)
ll1.print_list()

ll1.insert_at_front(2)
ll1.insert_at_front(1)
ll1.insert_at_end(5)
ll1.get_last_node()
ll1.print_list()