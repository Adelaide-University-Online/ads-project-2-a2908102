import java.util.*;

public interface Graph {
    int getNumVertices();
    boolean isDirected();
    void insert_edge(Edge edge);
    boolean is_edge(int source, int destination);
    Edge getEdge(int source, int destination);
    Iterator<Edge> edge_iterator(int soorce);
}
