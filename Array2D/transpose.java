package Array2D;

import java.util.Scanner;
import java.util.Random;

public class transpose {
    public static void main(String[] args){
        int[][] arr = create(3, 3,10);
        display(arr);
        int[][] trans = transposed(arr);
        display(trans);
    }
    public static int[][] create(int a, int b, int c){
        int[][] arr = new int[a][b];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(10);
            }

        }
        return arr;
    }
    public static void display(int[][] arr){
        for(int[] nums : arr){
            for(int num : nums){
                System.out.print(num+ " ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] transposed(int[][] arr){
        int[][] transposedarr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposedarr[j][i] = arr[i][j];
            }
        }
        return transposedarr;
    }
}
