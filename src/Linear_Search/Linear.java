package Linear_Search;
import  java.util.Scanner;
class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,4,5,6,7,8,9,0,1,41,32,33,43,56};
        System.out.print("Enter you number: ");
        int num = sc.nextInt();
        int index = LinearSearch(arr,num);
        if(index != -1)
            System.out.println("Element found at "+index);
        else
            System.out.println("This"+"'"+num+"'"+ "element is not found");

    }

    private static int LinearSearch(int[] arr, int num) {
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}