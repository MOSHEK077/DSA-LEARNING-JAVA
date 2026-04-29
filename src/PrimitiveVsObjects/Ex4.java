package PrimitiveVsObjects;

import java.util.HashMap;
import java.util.HashSet;

public class Ex4 {
    /*
     // ── Section 2: Null safety ────────────────────────────────────
     // TODO 2a: Create a HashMap<String, Integer>. Put "apple" -> 3.
     //          Get the count for "banana" (missing key). Print it.
     //          What does it return?
     // TODO 2b: Fix it using getOrDefault so you get 0 for missing keys.
     //          Increment the count and print it safely.
    */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",3);
        Integer bananaCount = map.get("banana");
        System.out.println(bananaCount);
    }
}
