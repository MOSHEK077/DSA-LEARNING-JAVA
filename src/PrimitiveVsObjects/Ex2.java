package PrimitiveVsObjects;

public class Ex2 {
    // TODO 1b: Create two Integer variables with value 200. Compare with ==.
    //          Then compare with .equals(). Print both results.
    //          Why does == return false but .equals() return true?

    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        if(a.equals(b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
