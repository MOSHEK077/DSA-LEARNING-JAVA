package Array;

import java.util.Arrays;

public class sortStrings {
    public static void main(String[] args) {
        String list[] = {"Pradeep","Naveen","Manikandan","Shajin Raj","Moshek Shaju Jones J"};
        Arrays.sort(list);
        for(String names : list){
            System.out.println(names);
        }
    }
}

//Acending Order
//Output:
//Manikandan
//Moshek Shaju Jones J
//Naveen
//        Pradeep
//Shajin Raj