package STACK;

import java.util.Scanner;
import java.util.Stack;

public class stack3 {
    private static String name;
    private static String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmployementid() {
        return employementid;
    }

    public void setEmployementid(String employementid) {
        this.employementid = employementid;
    }

    private static String employementid;

    public static void display(){
        try{


        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        place = scanner.nextLine();
        employementid = scanner.nextLine();
        Stack<String> st = new Stack<String>();
        st.push(name);
        st.push(place);
        st.push(employementid);
        System.out.println(st);
        System.out.println("Size of the Stack: "+st.size());

        System.out.println("It returns the Particular value through specific index: "+st.elementAt(0));
        }catch (Exception e){
           e.printStackTrace();

        }
        }


    public static void main(String[] args) {

        display();

    }
}
