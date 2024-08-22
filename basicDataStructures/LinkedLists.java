package basicDataStructures;

import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println("The linked list is: " + linkedList);
//        linkedList.pop();
//        linkedList.poll();
//        System.out.println("The linked list after poll is: " + linkedList);

        linkedList.add(4, "E");
        System.out.println("The linked list after adding E is: " + linkedList);

//        System.out.println("The first element is: " + linkedList.getFirst());
        System.out.println("The first element is: " + linkedList.peekFirst());
//        System.out.println("The last element is: " + linkedList.getLast());
        System.out.println("The last element is: " + linkedList.peekLast());
        System.out.println("The element at index 2 is: " + linkedList.get(2));
        linkedList.addFirst("0");
        System.out.println("Now the linked list is: " + linkedList);
        linkedList.addLast("G");
        System.out.println("Now the linked list is: " + linkedList);
        String firstElement = linkedList.removeFirst();
        String lastElement = linkedList.removeLast();
        System.out.println("The first element removed was: " + firstElement);
        System.out.println("The last element removed was: " + lastElement);

    }

}
