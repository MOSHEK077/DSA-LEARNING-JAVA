package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

class Example3{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(3);//Adding a new Element into the queue;
        q.offer(5);
        q.offer(31);
        q.offer(52);
        q.offer(53);
        q.offer(21);
        q.offer(14);
        q.offer(20);
        System.out.println("You can see the current elements inside the Queue List: "+q);
        //Removing the elements using the method like poll for queue Data Structure;
        System.out.print(""+q.poll()+"= first person's id") ;
        System.out.println(" "+q.poll()+"= Second person's id");

        //FIFO = First in First out just like a Ticket counter, audience will prefer by the order;
        //First in and First will be out when ticket given;
        System.out.println("You can see two elements were deleted from the Queue: "+q);
        q.offer(4);//to add the new element into the queue;
        q.poll();//To remove the element from the given queue;

        System.out.println("peek returns the first most values from the queue data structure "+q.peek());


    }
}