package LeetCodeQuestions.Arrays;

public class removeoccurance {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = {1,2,3,4,3};
        int res = removeoccurances(nums, val);
        System.out.println(res);
    }
    public static int removeoccurances(int[] nums, int val){
        int[] arr = new int[nums.length];
        int size = 0;
        int j =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
                arr[j] = nums[i];
                j++;
                size++;
            }
        }
        arr =nums;
        return size;
    }

}
