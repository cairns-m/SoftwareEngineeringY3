import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DAG {
    private int V;						// number of vertices
	private int E;						// number of edges
	private ArrayList<Integer>[] adj;   // adjacency list for vertex 
	private int [] indegree;			// indegree of vertex 
	//private int [] outdegree;			// outdegree of vertex 
	private boolean marked [];			// list of the visited vertices
	private boolean hasCycle;			// true if graph has a cycle
	private boolean stack [];			
	
	
	public DAG(int V)
	{

		this.V = V;
		this.E = 0;
		indegree = new int[V];
		marked = new boolean[V];
		stack = new boolean[V];
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		
		for(int v = 0; v < V; v++)
		{
			adj[v] = new ArrayList<Integer>();
		}
	}
		
	// returns the current vertex
	public int V()
	{
		return V;
	}
	
	public int E()
	{
		return E;
	}
	
	// adds directed edge from v to w
	public void addEdge(int v, int w)
	{
		if((validateVertex(v) > 0) && (validateVertex(w) > 0))
		{
			adj[v].add(w);
			indegree[w]++;
			E++;
		}
	}
	
	private int validateVertex(int v)
	{
		if(v < 0 || v >= V)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
	// returns number of directed edges to vertex v
	public int indegree(int v)
	{
		if(validateVertex(v) > 0)
		{
			return indegree[v];
		}
		else
		{
			return -1;
		}
		
	}
	
	// returns number of directed edges from vertex v
	public int outdegree(int v)
	{
		if(validateVertex(v) > 0)
		{
			return adj[v].size();
		}
		else
		{
			return -1;
		}
	}
	
	// returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
	
	public boolean hasCycle()
	{
		return hasCycle;
	}
	
	public void findCycle(int v)
	{
		marked[v] = true;
		stack[v] = true;
		
		for(int w : adj(v))
		{
			if(!marked[w])
			{
				findCycle(w);
			}
			else if(stack[w])
			{
				hasCycle = true;
				return;
			}
		}
		stack[v] = false;
	}
}
