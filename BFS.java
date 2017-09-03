
class Graph
{
    private int V;   
    private LinkedList<Integer> adj[]; 
 
    
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
   
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
 
    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        
        boolean visited[] = new boolean[V];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
           
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
 
    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
        int u=sc.nextInt();
        int v=sc.nextInt();
        g.addEdge(u, v);
        }
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}