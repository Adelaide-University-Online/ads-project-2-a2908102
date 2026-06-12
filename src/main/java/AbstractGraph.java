/**
 * File: AbstractGraph.java
 * Description: This contains the AbstractGraph abstract class which creates
 * the graph from a file.
 * Author: Amelia Bond
 * Student ID: 2908102
 * Email ID: a2908102
 * AI Tool Used: N
 * This is my own work as defined by
 *    the University's Academic Integrity Policy.
 **/

import java.util.*;

public abstract class AbstractGraph implements Graph {
    /** The number of vertices */
    private int num_vertices;
    /** If the graph is directed */
    private boolean is_directed;
    /** String array of the vertices */
    private static String[] vertices;

    /** Constructor to implement class
     * @param num_vertices number of vertices
     * @param is_directed if graph is directed
     */
    public AbstractGraph(int num_vertices, boolean is_directed) {
        this.num_vertices = num_vertices;
        this.is_directed = is_directed;
    }

    /** Returns the number of vertices in the graph
     * @return number of vertices
     */
    public int getNum_vertices() {
        return num_vertices;
    }

    /** Returns if the graph is directed
     * @return whether the graph is directed
     */
    public boolean getIs_directed() {
        return is_directed;
    }

    /** Returns a string array of the vertices
     * @return vertices
     */
    public String[] getVertices() {
        return vertices;
    }

    /** Extracts the edges from the imputed file
     * @param scanner scanner to run
     * @param list list of vertices
     */
    public void edges_from_file(Scanner scanner, List<String> list) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] arr_line = line.split(", ");
            if (arr_line.length == 1) {
                scanner.nextLine();
            } else {
                String course = arr_line[0];
                int course_num = list.indexOf(course);
                for (int i = 1; i < arr_line.length; i++) {
                    String pre_rec = arr_line[i];
                    int pre_rec_num = list.indexOf(pre_rec);
                    Edge edge = new Edge(pre_rec_num, course_num);
                }
            }
        }
        scanner.close();
    }

    /** Creates graph
     * @param scanner scanner to run
     * @param is_directed if graph is directed
     * @return created graph
     */
    public static Graph createGraph(Scanner scanner, boolean is_directed) {
        String first_line = scanner.nextLine();
        String[] arr_vertices = first_line.split(", ");
        vertices = arr_vertices;
        List<String> list = Arrays.asList(vertices);
        AbstractGraph returnValue;
        returnValue = new ListGraph(list.size(), is_directed);
        returnValue.edges_from_file(scanner, list);
        return returnValue;
    }
}
