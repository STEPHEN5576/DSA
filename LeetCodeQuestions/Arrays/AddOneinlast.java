package LeetCodeQuestions.Arrays;

public class AddOneinlast {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        add(nums);
    }
    public static int[] add(int[] nums){
        for(int i= nums.length-1; i>=0; i--){
            nums[i]++;

            if(nums[i] < 10){
                return nums;
            }

            nums[i]=0;
        }
        int[] result = new int[nums.length+1];
         result[0] = 1;
         return result;
    }
}
