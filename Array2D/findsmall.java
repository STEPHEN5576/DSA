package Array2D;

public class findsmall {
    public static void main(String args[]){
        int[][] arr = {
                {7,6,9},
                {2,8,1},
        };
        int smallestNumber = arr[0][0];
        for(int[] nums: arr){
            for(int num : nums){
                if(num < smallestNumber){
                    smallestNumber = num;
                }
            }
        }
        System.out.println(smallestNumber);

    }
}
