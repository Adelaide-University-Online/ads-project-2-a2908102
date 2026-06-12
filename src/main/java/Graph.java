/**
 * File: Graph.java
 * Description: Holds the graph interface.
 * Author: Amelia Bond
 * Student ID: 2908102
 * Email ID: a2908102
 * AI Tool Used: N
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.*;

public interface Graph {
    /** Returns the number of vertices in the graph
     * @return number of vertices
     */
    int getNum_vertices();

    /** Returns if the graph is directed
     * @return whether the graph is directed
     */
    boolean getIs_directed();

    /** Returns a string array of the vertices
     * @return vertices
     */
    String[] getVertices();

    /** inserts an edge into the graph
     * @param edge edge to insert
     */
    void insert_edge(Edge edge);

    /** Runs an iterator of edges of the source vertex
     * @param source vertex
     * @return the edge iterator
     */
    Iterator<Edge> edge_iterator(int source);
}
