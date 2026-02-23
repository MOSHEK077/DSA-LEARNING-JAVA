package LinkedList;


import java.util.LinkedList;

//LinkedList implements Stack and Queue
public class link1 {

    public static void main(String[] args) {

        //Linked List = Stack + Queue
        //Stack Data Structure in a linkedlist
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("Moshek");//Last in
        linkedList.push("Harish");
        linkedList.push("Rama");
        linkedList.push("Abishek");//first out
        System.out.println(linkedList);
        //LIFO
        //Last in first out
        //System.out.println(linkedList.pop());
        linkedList.pop();
        System.out.println(linkedList);
        System.out.println("Stack in Linkedlist");

        //Queue in Linkedlist
        //FIFO = FIRST IN FIRST OUT
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        linkedList2.offer(2);
        linkedList2.offer(3);
        linkedList2.offer(4);
        linkedList2.offer(1);
        linkedList2.offer(7);
        System.out.println(linkedList2);
        //First in first out;
        linkedList2.poll();
        System.out.println(linkedList2);
        linkedList2.poll();
        System.out.println(linkedList2);
        System.out.println();
        System.out.println("Peek First "+linkedList2.peekFirst());
        System.out.println("Peek last "+linkedList2.peekLast());
        System.out.println();

        //We can also add a new element both first and last;
        linkedList2.addFirst(3);
        System.out.println(linkedList2);
        linkedList2.addLast(10);
        System.out.println(linkedList2);

        //We can add new element in a particular index without affect other nodes;
        linkedList2.add(2,50);
        System.out.println();
        System.out.println("Successfully added a new element in a specific index");
        System.out.println(linkedList2);

        System.out.println("Removing First and Last elements using Methods !");
        linkedList2.removeFirst();
        System.out.println(linkedList2);
        System.out.println("Remove last");
        linkedList2.removeLast();
        System.out.println(linkedList2);
        System.out.println("We easily return the index values also....");

        System.out.println( linkedList2.indexOf(50));

        System.out.println("Thank you !");



//LinkedList having both Stack and Queue data structures .
        //Stack = push() , pop(), isEmpty(), .size(), .contains(),
        //Queue = offer(), poll(), isEmpty(), .size(), .contains(),
        //linkedList = add(), addFirst(), addLast(), removeFirst(),removeLast(),peekFirst(),peekLast() and also we can use
        //method indexOf() to check the index number where the elements are mention inside the parameter of indexOf(parameter);
    }
}
