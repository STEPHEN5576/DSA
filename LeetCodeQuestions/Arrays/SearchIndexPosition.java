package LeetCodeQuestions.Arrays;

import java.util.Scanner;

public class SearchIndexPosition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int find = sc.nextInt();

        int[] arr = {1,3,5,6};
        int res=  IndexPosition(arr, find);
        System.out.println(res);
    }
    public static int IndexPosition(int[] arr, int find){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= find){
                ans++;
            }
        }
        return ans;
    }

}
