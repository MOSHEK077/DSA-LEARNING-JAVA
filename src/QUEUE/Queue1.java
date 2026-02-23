package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        //FIFO
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());
        queue.offer("Karen");//adding
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
        //System.out.println(queue.peek());
        queue.poll();//Removing queue
        queue.poll();
        queue.poll();//Removing queue
        queue.poll();
        //queue.element();
        //System.out.println(queue);
    }
}
