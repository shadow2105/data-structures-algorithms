type = input("Enter 'u' for Undirected graph; 'd' for Directed graph: ")
print(type + "\n")

class graph:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adj = {}
        for v in range(self.vertices):
            self.adj[v] = []
            
    def insert_edge(self, src, dest):
        if src >= self.vertices or dest >= self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
        
        elif type == 'd' or type == 'u':    
            self.adj[src].append(dest)
            if type == 'u' and src not in self.adj[dest]:
                self.adj[dest].append(src)
            
    def delete_edge(self, src, dest):
        if src >= self.vertices or dest >= self.vertices or src < 0 or dest < 0:
            print("Invalid Edge! ({}, {})\n".format(src, dest))
         
        elif type == 'u' or type == 'd':
            try:
                self.adj[src].remove(dest)
                if type == 'u':                         
                    self.adj[dest].remove(src)
                                                          
            except (KeyError, ValueError):
                pass
                    
    def print_graph(self):
        list_adj = sorted(self.adj.items())
        for i in range(len(list_adj)):
            list_adj[i] = list(list_adj[i])
            list_adj[i][1].sort()
            list_adj[i] = tuple(list_adj[i])
        for item in list_adj:
            print(item)
        print("\n")

gph = graph(7)
gph.delete_edge(3,1)
gph.insert_edge(1,2)
gph.insert_edge(2,4)
gph.insert_edge(4,5)
gph.insert_edge(9,1)
gph.insert_edge(2,0)
gph.insert_edge(3,5)
gph.insert_edge(2,2)
gph.insert_edge(3,3)

gph.delete_edge(3,3)
gph.delete_edge(3,4)

gph.print_graph()