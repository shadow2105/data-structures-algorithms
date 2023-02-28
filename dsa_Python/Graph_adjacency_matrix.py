type = input("Enter 'u' for Undirected graph; 'd' for Directed graph: ")
print(type + "\n")

class graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adj = []
        for i in range(vertices):
            self.adj.append([0 for j in range(vertices)])
            
    def insert_edge(self, src, dest):
        if src >= self.vertices or dest >= self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
            
        elif type == 'd' or type == 'u':
            self.adj[src][dest] = 1
            if type == 'u':
                self.adj[dest][src] = 1
            
    def delete_edge(self, src, dest):
        if src >= self.vertices or dest >= self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
            
        elif type == 'd' or type == 'u':
            self.adj[src][dest] = 0
            if type == 'u':
                self.adj[dest][src] = 0
                
    def print_graph(self):
        print("     ", end ="")
        for v in range(len(self.adj)): 
            v = "[" + str(v) + "]"
            print("{:4}".format(v), end = "")
        print()
        v = 0
        for row in self.adj:
            print("\n[{}]".format(v), end = "")
            v += 1
            for val in row:
                print("{:4}".format(val), end = "")
            print()
        print("\n")

gph = graph(5)

gph.insert_edge(1,2)
gph.insert_edge(2,4)
gph.insert_edge(5,3)
gph.insert_edge(4,4)

gph.print_graph()