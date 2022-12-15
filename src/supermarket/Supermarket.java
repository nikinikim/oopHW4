package supermarket;

import java.util.ArrayDeque;
import java.util.Queue;

public class Supermarket {

    private Queue<String> deque1 = new ArrayDeque<>(5);
    private Queue<String> deque2 = new ArrayDeque<>(5);
    private Queue<String> deque3 = new ArrayDeque<>(5);

    public void addConsumer(String consumer) {
        if (deque1.size() < 5) {
            deque1.add(consumer);
            System.out.println("В первую очередь " + consumer);
        }else {
            if (deque2.size() < 5) {
                deque2.add(consumer);
                System.out.println("Во вторую очередь " + consumer);
            }else {
                deque3.add(consumer);
                System.out.println("В третью очередь " + consumer);
            }
        }
    }


}
