package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphForList {

    ArrayList<LinkedList<Node>> aList;

    public GraphForList() {
        aList = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int source, int destination){
        LinkedList<Node> currentList = aList.get(source);
        Node destinationNode = aList.get(destination).get(0);
        currentList.add(destinationNode);
    }

    public boolean hasEdge(int source, int destination){
        LinkedList<Node> currentList = aList.get(source);
        Node destinationNode = aList.get(destination).get(0);
        return currentList.contains(destinationNode);
    }

    public void printList(){
        for (int i = 0; i < aList.size(); i++){
            LinkedList<Node> currentList = aList.get(i);
            System.out.print(currentList.get(0).data + " -> ");
            for (int j = 1; j < currentList.size(); j++){
                System.out.print(currentList.get(j).data + " ");
            }
            System.out.println();
        }
    }

}
