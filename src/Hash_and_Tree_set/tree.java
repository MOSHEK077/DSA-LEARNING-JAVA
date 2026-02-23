package Hash_and_Tree_set;

import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        TreeSet tr = new TreeSet<Integer>();
        tr.add(3);
        tr.add(1);
        tr.add(5);
        tr.add(2);
        tr.add(7);
        //tr.add(null);//It doesn't allow null values
        System.out.println(tr);
        System.out.println(tr.first());
        System.out.println(tr.last());

        System.out.println(tr);
    }
}
