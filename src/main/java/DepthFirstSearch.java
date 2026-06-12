import java.util.Iterator;

public class DepthFirstSearch {
    private Graph graph;
    private int discovery_index = 0;
    private int[] discovery_order;
    private int finish_index = 0;
    private int[] finish_order;
    private int[] parent;
    private boolean[] visited;

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

}
