package PriorityQueue;

import java.text.Collator;
import java.util.*;
//First in first out
public class Priority1 {
    public static void main(String[] args) {
        //Queue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());
        //we can also change the order also;
        queue.offer(4.5);
        queue.offer(3.1);
        queue.offer(1.4);
        queue.offer(5.4);
        queue.offer(2.4);
        queue.offer(3.6);
//priorityQueue
        //A FIFO serves elements with the highest priorities first before
        //elements with lower priority


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
