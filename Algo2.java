import java.util.Arrays;
import java.util.Scanner;

public class Algo2 {
    public static void binarySearch(int[] array,int element){ //binary search
        //for this approach array should be sorted
        int lower_index = 0;
        int higher_index = array.length-1;
        int mid_index = (lower_index + higher_index)/2;
        while(lower_index<=higher_index){
            if(array[mid_index]==element){
                System.out.println("Element Found!");
                break;
            }
            else if(element<array[mid_index]){
                higher_index = mid_index-1;
            }
            else{
                lower_index = mid_index+1;
            }
            mid_index = (lower_index + higher_index)/2;
        }
        if(lower_index>higher_index){
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
        System.out.println("Using Binary Search :");
        Arrays.sort(arr);
        binarySearch(arr,21);
    }
}
