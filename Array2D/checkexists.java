package Array2D;
import java.util.Scanner;
public class checkexists {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1,2,3,4},
                {6,9,8,7},
        };
        boolean answer = checked(arr, sc);
        System.out.println(answer);
    }

    public static boolean checked (int[][] arr, Scanner sc){
        int n = sc.nextInt();

        for(int[] nums : arr){
            for(int num : nums){
                if(num == n){
                    return true;
                }
            }
        }
        return false;
    }
}





