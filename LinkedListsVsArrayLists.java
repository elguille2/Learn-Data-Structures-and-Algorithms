import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListsVsArrayLists {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long duration;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        //********* LinkedList *********

        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(500000);
//        linkedList.get(linkedList.size()-2); // This does not take long because it is a doubly linked list
//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(linkedList.size()-1);

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("Duration for LinkedList:\t" + duration+ " ns");

        //********* ArrayList *********

        startTime = System.nanoTime();

//        arrayList.get(0)
//        arrayList.get(500000);
//        arrayList.get(arrayList.size()-1);
//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(arrayList.size()-1);

        endTime = System.nanoTime();

        duration = endTime - startTime;

        System.out.println("Duration for ArrayList:\t\t" + duration+ " ns");

    }


}
