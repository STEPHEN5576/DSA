package SortingDataStructure;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        sort(arr);

    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max and swap with curr index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr , 0, last);
            swaps(arr, maxIndex, last);

        }

    }

    private static void swaps(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

}
