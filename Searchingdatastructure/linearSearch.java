package Searchingdatastructure;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10,22,33,45,62};
        int target = 33;
        boolean res= check(arr, target);
        System.out.println(res);
    }
    public static boolean check(int[] arr , int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }

        }
        return false;
    }
}
