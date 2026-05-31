import java.util.*;

public class ListGraph extends AbstractGraph {
    private List<Edge>[] edges;

    public ListGraph(int num_vertices, boolean is_directed) {
        super(num_vertices,is_directed);
        edges = new List[num_vertices];
        for (int i = 0; i < num_vertices; i++) {
            edges[i] = new LinkedList<Edge>();
        }
    }

}
