package graph;


/**
 * Base interface for weighted queue implementations. 
 * Throw exceptions as appropriate. 
 */
public interface WeightedGraph {
	
	/**
	 * Insert edge e into the weighted graph
	 * 
	 * @param e edge to be inserted to the weighted graph
	 */
	public void insert(Edge e);
	
	
	/**
	 * Return an iterator over edges incident to v
	 * 
	 * @param v vertex element to find edges ajdacent to
	 * 
	 * @return iterator over edges incident to v
	 */
	Iterable<Edge> adj(int v);
	
	
	/**
	 * Return the number of vertices
	 * 
	 * @return integer element containing number of elements
	 */
	int V();
	
	
	/**
	 * Return a string representation
	 * 
	 * @return String element containing representation of the graph
	 */
	String toString();

}
