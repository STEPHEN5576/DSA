package SortingDataStructure;
import java.util.Arrays;
public class incertionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length-1; i++) {
           for(int j = i+1; j>0; j--){
               if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
           }
        }
    } 
}
