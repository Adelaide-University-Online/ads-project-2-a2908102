/**
 * File: Edge.java
 * Description: Holds the edge class which represents the edge of a graph.
 * Author: Amelia Bond
 * Student ID: 2908102
 * Email ID: a2908102
 * AI Tool Used: N
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/
public class Edge {
    /** The source vertex for the edge */
    private int source_vertex;
    /** The destination vertex for the edge */
    private int dest_vertex;

    /** Creates the edge between the two vertices
     * @param source the source vertex
     * @param dest the destination vertex
     */
    public Edge(int source, int dest) {
        this.dest_vertex = dest;
        this.source_vertex = source;
    }

    /** Checks if the two edges are equal
     * @param edge the edge to compare to
     * @return true of the edges are the same or false otherwise
     */
    public boolean equal_edges(Edge edge) {
        int edge_dest = edge.getDest_vertex();
        int edge_source = edge.getSource_vertex();
        if (edge_dest == dest_vertex && edge_source == source_vertex) {
            return true;
        } else {
            return false;
        }
    }

    /** return the source vertex
     * @return source vertex
     */
    public int getSource_vertex() {
        return source_vertex;
    }

    /** return the destination vertex
     * @return destination vertex
     */
    public int getDest_vertex() {
        return dest_vertex;
    }

    /** Display edge
     * @return string of the source and destination vertex
     */
    public String toString() {
        return Integer.toString(source_vertex) + " " + Integer.toString(dest_vertex);
    }
}

