/**
* File: filename.java
* Description: This contains the Runner class which implements a graph to create a study plan.
* Author: Amelia Bond
* Student ID: 2908102
* Email ID: a2908102
* AI Tool Used: N
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/

import java.io.*;
import java.util.*;

public class Runner {
    /** File with degree structure */
    private File file;
    /** Number of courses to study concurrently */
    private int num_courses;
    /** Array with course codes */
    private String[] courses;
    /** Array with the order the courses should be studied */
    private int[] course_order;

    /** Constructor to create an instance
     * @param file file with course structure
     * @param num_courses number of courses studied concurrently
     */
    Runner(File file, Integer num_courses) {
        this.file = file;
        this.num_courses = num_courses;
    }

    /** Creates graph from file, runs a depth first search
     * and reverses the finish order */
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

    /** Runs the sort courses method and converts the ordered numbers to a queue
     * before displaying study plan */
    public void degree_planner() {
        sort_courses();
        Queue<String> order_course = new PriorityQueue<>();
        for (int i = 0; i < course_order.length; i++) {
            int course_num = course_order[i];
            String course_code = courses[course_num];
            order_course.add(course_code);
        }
        double num = Double.valueOf(courses.length)/Double.valueOf(num_courses);
        int num_periods = (int) Math.ceil(num);
        for (int j = 0; j < num_periods; j++){
            System.out.println("Study Period " + (j+1));
            for (int i = 0; i < num_courses; i++) {
                System.out.println(order_course.poll());
            }
        }
    }

    /** Main method to run examples*/
    public static void main(String[] args) {
        File XBDA = new File("/Users/ameliabond/Desktop/XBDA.txt");
        Runner runner = new Runner(XBDA, 2);
        System.out.println("XBDA Study Plan");
        runner.degree_planner();

        File XBIT = new File("/Users/ameliabond/Desktop/XBIT.txt");
        Runner runner2 = new Runner(XBIT, 4);
        System.out.println("XBIT Study Plan");
        runner2.degree_planner();
    }
}
