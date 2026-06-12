/**
 * File: ListGraph.java
 * Description: Contains the ListGraph class which holds the graph using linked lists.
 * Author: Amelia Bond
 * Student ID: 2908102
 * Email ID: a2908102
 * AI Tool Used: N
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.*;

public class ListGraph extends AbstractGraph {
    /** List to store the vertices */
    private List<Edge>[] edges;

    /** Constructor to create linked lists from the edges
     * @param num_vertices number of vertices in graph
     * @param is_directed if the graph is directed
     */
    public ListGraph(int num_vertices, boolean is_directed) {
        super(num_vertices,is_directed);
        edges = new List[num_vertices];
        for (int i = 0; i < num_vertices; i++) {
            edges[i] = new LinkedList<Edge>();
        }
    }

    /** Insert edge into graph
     * @param edge edge to insert
     */
    public void insert_edge(Edge edge) {
        edges[edge.getSource_vertex()].add(edge);
        if(!this.getIs_directed()) {
            edges[edge.getDest_vertex()].add(new Edge(edge.getDest_vertex(),
                    edge.getSource_vertex()));
        }
    }

    /** Iterate through edges for a vertex
     * @param source source vertex
     * @return the edge iterator
     */
    public Iterator<Edge> edge_iterator(int source) {
        return edges[source].iterator();
    }

    /** Returns an edge
     * @param source source vertex
     * @param destination destination vertex
     * @return edge if it exists otherwise null
     */
    public Edge get_edge(int source, int destination) {
        Edge target = new Edge(source, destination);
        for (Edge edge: edges[source]) {
            if (edge.equal_edges(target))
                return edge;
        }
        return null;
    }

    /** Returns the number of vertices
     * @return number of vertices
     */
    public int getNum_vertices() {
        return super.getNum_vertices();
    }

    /** Returns if the graph is directed
     * @return if graph is directed
     */
    public boolean getIs_directed() {
        return super.getIs_directed();
    }
}
/** This code was inspired by:
 * Koffman, E. B. & Wolfgang, P. A. T. (2015). Data structures : Abstraction and Design using Java, 3rd Edition. Wiley.
 * Available at: https://ebookcentral.proquest.com/lib/adelaideuni/reader.action?c=UERG&docID=5106355&ppg=541
 */