package graphs;

public class AdjacencyMatrix {

    public static void main(String[] args) {

        GraphForMatrix graph = new GraphForMatrix(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.printMatrix();

        System.out.println("Edge between A & B?: " + graph.hasEdge(0, 1));
        System.out.println("Edge between C & A?: " + graph.hasEdge(2, 0));
    }

}
