import java.io.*;
import java.util.*;

/**
* File: filename.java
* Description: A brief description of this Java module.
* Author: Steve Jobs
* Student ID: 12345678
* Email ID: jobst007
* AI Tool Used: Y/N (This includes all AI Tools e.g. ChatGPT, Microsoft or Github Copiliot etc... Please leave blank if you do not wish to share this information)
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
public class Runner {
    private File file;
    private int num_courses;
    private String[] courses;
    private int[] course_order;

    Runner(File file, Integer num_courses) {
        this.file = file;
        this.num_courses = num_courses;
    }


    private void sort_courses() {
        Graph graph = null;
        int num_vertices = 0;
        try {
            Scanner scan = new Scanner(file);
            graph = AbstractGraph.createGraph(scan,true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.courses = graph.getVertices();
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        int[] finish_order = dfs.getFinish_order();
        int n = finish_order.length;
        int[] course_order = new int[n];
        for (int i = 0; i < finish_order.length; i++) {
            course_order[n-1] = finish_order[i];
            n = n - 1;
        }
        this.course_order = course_order;
    }


    
}
