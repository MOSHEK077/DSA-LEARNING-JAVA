package Array__List;

import java.util.ArrayList;

public class Array_list1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        System.out.println("Size of elements "+arr.size());
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.add(2,13);
        System.out.println(arr);
        arr.removeAll(arr);
        System.out.println(arr);
        System.out.println("Size of elements "+arr.size());
        System.out.println(arr.isEmpty());
        System.out.println("Thank you");
        //ArrayList is a resizable-array implementation of the List interface.
        //It permits all elements, including null, and maintains insertion order.

    }
}