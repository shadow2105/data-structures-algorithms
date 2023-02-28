type = input("Enter 'u' for Undirected graph; 'd' for Directed graph: ")
print(type + "\n")
                
class node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

class graph:
    def __init__(self, vertices):
        self.vertices = vertices 
        self.vert_ptr = [None] * self.vertices
        
    def insert_edge(self, src, dest):
        if src > self.vertices or dest > self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
            
        elif type == 'd' or type == 'u':
            self.vert_ptr[src] = node(data = dest, next = self.vert_ptr[src])
            if type == 'u' and src != dest:
                self.vert_ptr[dest] = node(data = src, next = self.vert_ptr[dest])
                
    def delete_edge(self, src, dest):
        if src > self.vertices or dest > self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
            
        elif type == 'd' or type == 'u':
            try:
                curr = self.vert_ptr[src]
                prev = None
                while curr.data != dest:
                    prev = curr
                    curr = curr.next
                if prev == None:
                    self.vert_ptr[src] = curr.next
                    curr.next = None
                elif curr:
                    prev.next = curr.next
                    curr.next = None
                
                if type == 'u':
                    curr = self.vert_ptr[dest]
                    prev = None
                    while curr.data != src:
                        prev = curr
                        curr = curr.next
                if prev == None:
                    self.vert_ptr[dest] = curr.next
                    curr.next = None
                elif curr:
                    prev.next = curr.next
                    curr.next = None
            except AttributeError:
                pass
                
    
    def print_graph(self):
        for v in range(self.vertices):
            print("[" + str(v) + "] -> ", end = "")
            node = self.vert_ptr[v]
            while node != None:
                print(node.data, end = " -> ")
                node = node.next
            print()   
        print("\n")
    
        
        

gph = graph(7)

gph.insert_edge(2,4)
gph.insert_edge(2,3)
gph.insert_edge(8,7)
gph.insert_edge(6,3)
gph.insert_edge(3,1)
gph.insert_edge(0,0)
gph.insert_edge(0,5)
gph.print_graph()

gph.delete_edge(4,2)
gph.delete_edge(0,0)
gph.print_graph()