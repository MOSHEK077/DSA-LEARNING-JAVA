package Array_vs_LInked_List;
import java.util.LinkedList;
import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long startTime;
        long endTime;
        long elapsedTime;
        for(int i = 0 ; i < 1000000;i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        startTime = System.nanoTime();
        //linkedList.get(0);
        //linkedList.get(500000);
        //linkedList.get(999999);
        linkedList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:"+elapsedTime+" ms");

//        ------------------------ArrayList-------------------------
        startTime = System.nanoTime();
        //arrayList.get(999999);

        arrayList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:"+elapsedTime+" ms");


    }
}
