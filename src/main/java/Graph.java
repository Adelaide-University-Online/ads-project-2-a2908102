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
