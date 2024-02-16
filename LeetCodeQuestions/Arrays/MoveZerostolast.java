package LeetCodeQuestions.Arrays;
import java.util.Arrays;
public class MoveZerostolast {
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,4,5};
        Zeros(nums);
    }
    public static void Zeros(int[] nums){
        int slow = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = temp;
                slow++;
            }


        }
        System.out.println(Arrays.toString(nums));
    }

}
