package Searchingdatastructure;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,14,20,36,48};
        int target = 48;
        int res = search(arr, target);
        System.out.println(res);
    }
    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end- start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }

}
