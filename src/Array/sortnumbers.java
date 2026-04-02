package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortnumbers {
    public static void main(String[] args) {
        int []num = {131,442,441,14,424,13,440,1,3,5,100};
        Arrays.sort(num);
        for(int n : num){

            System.out.println(n);
        }
    }
}


//Output
//
//"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Users\jones\IntelliJ IDEA Community Edition 2025.1.4\lib\idea_rt.jar=51541" -Dfile.encoding=UTF-8 -classpath "D:\DSA IN  JAVA\out\production\DSA IN  JAVA" Array.sortnumbers
//1
//        3
//        5
//        13
//        14
//        100
//        131
//        424
//        440
//        441
//        442
