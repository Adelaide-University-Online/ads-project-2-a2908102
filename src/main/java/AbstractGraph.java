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

}
