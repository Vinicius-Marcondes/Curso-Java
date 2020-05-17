package exercises.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample { // First in / First Out
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Vinicius"); // Returns false when the queue is empty
        queue.offer("Ana"); // Throws exception when the queue is empty
        queue.offer("Lucas");
        queue.offer("Alexandre");
        queue.offer("Vitor");

        System.out.println(queue.peek()); // Returns null when the queue is empty
        System.out.println(queue.peek());
        System.out.println(queue.element()); // Throws exception when the queue is empty
        System.out.println(queue.element());

        // queue.size()
        // queue.clear()
        // queue.isEmpty()

        System.out.println(queue.poll()); // Returns the first element of the queue and removes it
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove()); // Remove the first element of the queue and throws an exception if empty
    }
}
