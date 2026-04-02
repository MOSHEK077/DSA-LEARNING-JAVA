package Array_vs_LInked_List;
import java.util.LinkedList;
public class Ex3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("SpringBoot");
        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("DOCKER");
        linkedList.add("MySQL");
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peekFirst());
    }
}
