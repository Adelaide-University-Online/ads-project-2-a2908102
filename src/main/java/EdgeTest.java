import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {

    @org.junit.jupiter.api.Test
    void equal_edges() {
        Edge edge = new Edge(1,2);
        edge.equal_edges(new Edge(2,3));
    }

    @org.junit.jupiter.api.Test
    void getSource_vertex() {
        Edge edge = new Edge(1,2);
        int result = edge.getSource_vertex();
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void getDest_vertex() {
        Edge edge = new Edge(1,2);
        int result = edge.getDest_vertex();
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Edge edge = new Edge(1,2);
        String result = edge.toString();
        assertEquals("1 2", result);
    }
}