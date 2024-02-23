package SortingDataStructure;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {32,3,12,7,6};
       int[] res= sort(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=1; j<arr.length; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
