public class Edge {
    private int dest_vertex;
    private int source_vertex;
    private double weight;

    public Edge(int source, int dest) {
        this.dest_vertex = dest;
        this.source_vertex = source;
        this.weight = 1.0;
    }
}
