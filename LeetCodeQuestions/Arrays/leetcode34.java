package LeetCodeQuestions.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class leetcode34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        Scanner sc= new Scanner(System.in);
        int search = sc.nextInt();
       int[] ans = Find(arr, search);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Find(int[] arr, int search){
        int[] nums = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== search && arr[i] == arr[i+1]){
                nums[0] = i;
                nums[1] = i+1;
                return nums;
            }
            else{
                nums[0] = -1;
                nums[1] = -1;
            }

        }
        return nums;
    }

}
