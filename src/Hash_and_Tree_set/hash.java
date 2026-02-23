package Hash_and_Tree_set;
import java.util.HashSet;

public class hash {
    public static void main(String[] args) {
        HashSet cars = new HashSet<String>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Benz");
        cars.add(null);//Allows only one null value

        System.out.println(cars);
        System.out.println(cars.size());

    }
}
