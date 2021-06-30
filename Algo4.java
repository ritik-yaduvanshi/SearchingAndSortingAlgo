import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algo4 {
   public static void selectionSort(int[] array){ //selection sort in array in increasing order
       int temp = 0;
       for (int i = 0; i < array.length; i++) {
           int min = i;
           for (int j = i+1; j < array.length; j++) {
               if(array[min]>array[j]){
                   min = j;
               }
           }
           temp = array[i];
           array[i] = array[min];
           array[min] = temp;
       }
   }
   public static void selectionSortDec(int[] arr){ //selection sort in array in decreasing order
       int temp = 0;
       for (int i = 0; i < arr.length; i++) {
           int max = i;
           for (int j = i+1; j < arr.length; j++) {
               if(arr[max]<arr[j]){
                   max = j;
               }
           }
           temp = arr[i];
           arr[i] = arr[max];
           arr[max] = temp;
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
        selectionSort(arr);
        System.out.println("Sorted Array In Increasing Order: "+ Arrays.toString(arr));
        selectionSortDec(arr);
        System.out.println("Sorted Array In Decreasing Order: "+ Arrays.toString(arr));

    }
}
