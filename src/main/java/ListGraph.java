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

    public boolean is_edge(int source, int dest) {
        return edges[source].contains(new Edge(source,dest));
    }

    public void insert_edge(Edge edge) {
        edges[edge.getSource_vertex()].add(edge);
        if(!this.getIs_directed()) {
            edges[edge.getDest_vertex()].add(new Edge(edge.getDest_vertex(),
                    edge.getSource_vertex()));
        }
    }

    public Iterator<Edge> edge_iterator(int source) {
        return edges[source].iterator();
    }

    public Edge get_edge(int source, int destination) {
        Edge target = new Edge(source, destination);
        for (Edge edge: edges[source]) {
            if (edge.equal_edges(target))
                return edge;
        }
        return null;
    }

    public int getNum_vertices() {
        return super.getNum_vertices();
    }

    public boolean getIs_directed() {
        return super.getIs_directed();
    }

}
