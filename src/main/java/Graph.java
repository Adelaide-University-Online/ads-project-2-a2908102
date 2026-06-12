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
    int getNum_vertices();
    boolean getIs_directed();
    String[] getVertices();
    void insert_edge(Edge edge);
    boolean is_edge(int source, int destination);
    Edge get_edge(int source, int destination);
    Iterator<Edge> edge_iterator(int source);
}
