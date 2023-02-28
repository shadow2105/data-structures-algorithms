class node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

class linked_list:
    def __init__(self):    
        self.head = None

    def insert_at_front(self, data):
        self.head = node(data = data, next = self.head)
        
    def is_empty(self):
        return self.head == None

    def insert_at_end(self, data):
        if not self.head:
            self.head = node(data = data)
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(data = data)

    def delete_node(self, key):
        curr = self.head
        prev = None
        
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
            
        if prev == None:
            self.head = curr.next
            curr.next = None
        elif curr:
            prev.next = curr.next
            curr.next = None
    
    def get_last_node(self):
        temp = self.head
        while temp.next != None:
            temp = temp.next
        return temp.data
        
            
    def print_list(self):
        nde = self.head
        while nde != None:
            print(nde.data, end = " -> ")
            nde = nde.next
        print("\n")
            

ll1 = linked_list()
ll1.insert_at_front(3)
ll1.insert_at_front(2)
ll1.insert_at_front(1)
ll1.insert_at_end(4)
ll1.insert_at_end(5)
ll1.insert_at_front(6)

ll1.print_list()

ll1.delete_node(6)

ll1.print_list()

print(ll1.is_empty())

print(ll1.get_last_node())


ll2 = linked_list()

string = "Ashwin Rajput"

for c in reversed(string.upper()):
    ll2.insert_at_front(c)
    
ll2.print_list()
            
    
        