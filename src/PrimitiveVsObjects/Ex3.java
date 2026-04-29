package PrimitiveVsObjects;

public class Ex3 {
    // TODO 1c: Try the same with value 100 (inside the cache range -128 to 127).
    //          Does == return true now? Why?

    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);
        /*
        When Java loads, it pre-creates Integer objects for every value from -128 to 127 and
        stores them in a cache pool.
        When you write Integer c = 100,
        Java doesn't create a new object — it hands you back the same cached object every time.
         */
    }
}
