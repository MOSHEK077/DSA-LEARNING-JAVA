package Linear_Search;


import  java.util.Scanner;

class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = {"Soap","Spray","Tripod","Spinner","cup","cap","hat","Bottle","Calculator","Notebook","scale","Tripod stick","NotePad","Bat"};
        System.out.print("search : ");
        String val = sc.next().toLowerCase();
        int index = LinearSearch(items,val);
        if(index != -1){
            System.out.println("Value found at "+index);
        }
        else {
            System.out.println("Element not found ");
        }
    }

    private static int LinearSearch(String[] items, String val) {
        for(int i = 0 ; i < items.length;i++){
            if(val.equalsIgnoreCase(items[i])){
                return i;
            }

        }
        return -1;
    }
}