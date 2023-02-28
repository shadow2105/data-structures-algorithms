class stack:
    def __init__(self, size):
        self.items = []
        self.size = size

    def is_empty(self):
        return self.items == []

    def push(self, item):
        if len(self.items) < self.size:
            self.items.append(item)
        else:
            print("Stack OVERFLOW")

    def pop(self):
        if len(self.items) > 0:
            self.items.pop()
        else:
            print("Stack UNDERFLOW")
        
    def stack_size(self):
        return len(self.items)
        
    def print_stack(self):
        print(self.items)


stk = stack(3)
stk.pop()

stk.push("a")
stk.push("b")
stk.push("d")
stk.print_stack()
print(stk.is_empty())
print(stk.stack_size())

stk.push("c")

stk.pop()
stk.print_stack()

stk.push("c")
stk.print_stack()


stk1 = stack(50)

string = "123+45"

for c in string:
    stk1.push(c)
    
stk1.print_stack()

for i in stk1.items:
    print(i, end ="")
    