import java.util.Arrays;
import java.util.Scanner;

public class Algo {
    public static void linearSearch(int[] array,int element){ //Linear Search in array
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                res = true;
                break;
            }
        }
        if(res){
            System.out.println("Element Found!");
        }
        else{
            System.out.println("Element Not Found!");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element");
        for (int i = 0; i < size; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println("Using Linear Search :");
        linearSearch(arr,14);
    }
}
