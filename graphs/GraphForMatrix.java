package graphs;

import java.util.ArrayList;

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

}
