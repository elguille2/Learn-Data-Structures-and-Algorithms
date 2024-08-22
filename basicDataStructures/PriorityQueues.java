package basicDataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public static void main(String[] args) {

        Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);

        System.out.println("The priority queue sorted in reverse order is: ");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("The normal queue is: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


    }

}
