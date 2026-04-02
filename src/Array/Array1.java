package Array;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        String[] val = {"Pineapple","Orange","Graphs","Apple"};
//        System.out.println(val[0]);
//        for(int i = 0 ; i < val.length;i++){
//            System.out.println(val[i]);
//        }

        Arrays.sort(val);//Elements in acending Order


        for(String fruits: val){

            System.out.println(fruits);
        }



    }
}
