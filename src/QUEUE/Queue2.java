package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

class Queue2{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
      /*
Think of a queue as people standing in line in a supermarket.
The first person to stand in line is also the first who can pay and leave the supermarket.
This way of organizing elements is called FIFO: First In First Out.
       */
        queue.offer(4);
        queue.offer(5);
        queue.offer(2);
        queue.offer(1);
        System.out.println(queue);
        //FIFO = First in first out;
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();

        queue.poll();
        queue.poll();

        System.out.println(queue);
    }
}