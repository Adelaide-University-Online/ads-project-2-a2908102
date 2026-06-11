public class Edge {
    private int dest_vertex;
    private int source_vertex;
    private double weight;

    public Edge(int source, int dest) {
        this.dest_vertex = dest;
        this.source_vertex = source;
        this.weight = 1.0;
    }

    public boolean equal_edges(Edge edge) {
        int edge_dest = edge.getDest_vertex();
        int edge_source = edge.getSource_vertex();
        if (edge_dest == dest_vertex && edge_source == source_vertex) {
            return true;
        } else {
            return false;
        }
    }

    public int getDest_vertex() {
        return dest_vertex;
    }

    public int getSource_vertex() {
        return source_vertex;
    }

    public double getWeight() {
        return weight;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return Integer.toString(source_vertex) + Integer.toString(dest_vertex);
    }
}

