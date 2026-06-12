/**
 * File: DepthFirstSearch.java
 * Description: Contains the DepthFirstSearch class which performs a graph searh.
 * Author: Amelia Bond
 * Student ID: 2908102
 * Email ID: a2908102
 * AI Tool Used: N
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.Iterator;

public class DepthFirstSearch {
    /** Graph the search is being performed on */
    private Graph graph;
    /** The index of the discovery order */
    private int discovery = 0;
    /** Array of vertices in the order they are discovered */
    private int[] discovery_order;
    /** The index of the finish order */
    private int finish = 0;
    /** Array of vertices in the order they are finished */
    private int[] finish_order;
    /** Array of parents in the graph */
    private int[] parent;
    /** Array to indicate if a vertex has been visited */
    private boolean[] visited;

    /** Constructor to create arrays for graph and run depth first search
     * @param graph graph being searched
     */
    public DepthFirstSearch(Graph graph) {
        this.graph = graph;
        int n = graph.getNum_vertices();
        discovery_order = new int[n];
        finish_order = new int[n];
        parent = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                depthFirstSearch(i);
            }
        }
    }

    /** Search through the graph from the current vertex
     * @param current vertex currently being visited
     */
    public void depthFirstSearch(int current) {
        visited[current] = true;
        discovery_order[discovery] = current;
        discovery++;
        Iterator<Edge> itr = graph.edge_iterator(current);
        while (itr.hasNext()) {
            int neighbour = itr.next().getDest_vertex();
            if (!visited[neighbour]) {
                parent[neighbour] = current;
                depthFirstSearch(neighbour);
            }
        }
        finish_order[finish] = current;
        finish++;
    }

    /** Returns the finish order
     * @return finish order
     */
    public int[] getFinish_order() {
        return finish_order;
    }
}
/** This code was inspired by:
 * Koffman, E. B. & Wolfgang, P. A. T. (2015). Data structures : Abstraction and Design using Java, 3rd Edition. Wiley.
 * Available at: https://ebookcentral.proquest.com/lib/adelaideuni/reader.action?c=UERG&docID=5106355&ppg=541
 */
