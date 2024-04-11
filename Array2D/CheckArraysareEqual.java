package Array2D;

public class CheckArraysareEqual {
    public static void main(String args[]){
        int [][] arr = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        boolean answer = tocheck(arr);
        System.out.println(answer);
    }
    public static boolean tocheck(int[][] arr){
        int ans = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == arr[i+1][j]){
                    count++;
                }
            }
            if(count != arr[0].length){
                return false;
            }
            ans = count;

        }
        if(ans == arr[0].length){
            return true;
        }
        return false;
    }
}
