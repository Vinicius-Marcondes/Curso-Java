package exercises.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack { // First in / Last Out
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("Player n1");
        books.push("Assassins Creed"); // Throws an exception if fails
        books.push("Lord of The Rings");

        System.out.println(books.peek()); // Returns null
        System.out.println(books.element()); // Throws an exception

        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        //System.out.println(books.remove());
        //System.out.println(books.remove());
        //System.out.println(books.pop());
    }
}
