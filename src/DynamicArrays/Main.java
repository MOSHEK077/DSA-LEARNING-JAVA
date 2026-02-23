package DynamicArrays;
// Java Program to Implement a Dynamic Array

// User Defined Array
class Array {

    private int arr[];
    private int count;

    // Method to return length of array
    public Array(int size){
        arr = new int[size];
    }

    // Method to print array
    public void printArray(){

        for (int i = 0; i < count; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to insert element in array
    public void insert(int ele){

        if (arr.length == count) {

            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];

            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];

            // Assigning new array to original array
            arr = newArr;
        }

        arr[count++] = ele;
    }
}

public class Main {
    public static void main(String[] args){

        // Creating object of Array(user-defined) class
        Array numbers = new Array(3);

        // Adding elements to array
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        // Extra element exceeding array size
        numbers.insert(50);

        // Calling printArray() method
        numbers.printArray();
    }
}