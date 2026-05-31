import java.util.*;
import java.io.*;

public abstract class AbstractGraph implements Graph {
    private int num_vertices;
    private boolean is_directed;

    public AbstractGraph(int num_vertices, boolean is_directed) {
        this.num_vertices = num_vertices;
        this.is_directed = is_directed;
    }

    public int getNum_vertices() {
        return num_vertices;
    }

    public boolean getIs_directed() {
        return is_directed;
    }

    public void edges_from_file(Scanner scanner) {
    }

    public static Graph createGraph(Scanner scanner, boolean is_directed) {
        int num_vertices = scanner.nextInt();
        AbstractGraph returnValue;
        returnValue = new ListGraph(num_vertices, is_directed);
        returnValue.edges_from_file(scanner);
        return returnValue;

    }
}
