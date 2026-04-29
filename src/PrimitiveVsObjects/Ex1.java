package PrimitiveVsObjects;

public class Ex1 {
    // ── Section 1: Equality trap

//     TODO 1a: Create two int variables with value 200. Compare with ==.
//              Print the result and explain why it's true.
public static void main(String[] args) {
    int a = 200;
    int b = 200;
    if(a==b){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}

}
