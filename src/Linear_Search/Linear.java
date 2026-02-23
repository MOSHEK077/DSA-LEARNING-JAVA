package Linear_Search;

import java.util.Scanner;

class Linear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data[] = {13,1,2,3,4,5,12,31,42,54,91,90,98,43};
        System.out.print("Enter the Id: ");
        int search = scanner.nextInt();
        int index = linearSearch(data,search);
        if(index != -1){
            System.out.println("Element found at "+index);
        }
        else{
            System.out.println("Element not found ");
        }
    }

    private static int linearSearch(int[] data, int search) {
        for(int i = 0 ; i < data.length; i++){
            if(data[i] == search){
                return i;

            }

        }
        return -1;
    }
}