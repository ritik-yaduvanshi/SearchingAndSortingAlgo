import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algo5 {
   //Insertion Sort Algorithm in array
    public static void insertionSort(int[] arr){
        int temp = 0,j=0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random val = new Random();
        System.out.print("Enter the Size Of Array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= val.nextInt(100);
        }
        System.out.println("Unsorted Array! : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
        
    }
}
