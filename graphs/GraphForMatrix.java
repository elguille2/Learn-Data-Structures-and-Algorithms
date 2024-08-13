package graphs;

import java.util.ArrayList;
import java.util.Queue;

public class GraphForMatrix {

    ArrayList<Node> nodes;
    int[][] matrix;

    public GraphForMatrix(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size]; // This is why space complexity is O(V^2)
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;

    }

    public boolean hasEdge(int source, int destination){
        if (matrix[source][destination] == 1){
            return true;
        }
        return false;
    }

    public void printMatrix(){
        System.out.print("  ");
        for (Node node : nodes){
            System.out.print(node.data + " ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int start){
        boolean[] visited = new boolean[matrix.length];
        depthFirstHelper(start, visited);
    }

    private void depthFirstHelper(int start, boolean[] visited) {
        if(visited[start]){
            return;
        }
        else {
            visited[start] = true;
            System.out.println(nodes.get(start).data + " = visited");
        }
        for (int i = 0; i < matrix[start].length; i++){
            if (matrix[start][i] == 1 && !visited[i]){
                depthFirstHelper(i, visited);
            }
        }
        return;
    }

    public void breadthFirstSearch(int start) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(nodes.get(node).data + " = visited");

            for (int i = 0; i < matrix[node].length; i++) {
                if (matrix[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
