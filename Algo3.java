import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algo3 {
    public static void bubbleSortDec(int[] array){
        //bubble sort algorithm for decreasing order
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int flag = 0;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    public static void bubbleSortInc(int[] array){
        //bubble sort algorithm for increasing order
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int flag = 0;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
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
        bubbleSortInc(arr);
        System.out.println("Sorted Array! In Increasing Order : "+ Arrays.toString(arr));
        bubbleSortDec(arr);
        System.out.println("Sorted Array! In Decreasing Order : "+ Arrays.toString(arr));
    }
}
