package basicDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Jhon");
        queue.offer("Luis");
        queue.offer("Miguel");

        System.out.println(queue);
        System.out.println("The first one in the queue is: " + queue.peek());
        queue.poll();
        System.out.println("Now, the first one in the queue is: " + queue.peek());

//        queue.poll();
//        queue.poll();
//        queue.poll();
//        System.out.println(queue);

        System.out.println("The queue is empty: " + queue.isEmpty());
        System.out.println("The queue size is: " + queue.size());
        System.out.println("Karen is in the queue: " + queue.contains("Karen"));
        System.out.println("Miguel is in the queue: " + queue.contains("Miguel"));




    }

}
