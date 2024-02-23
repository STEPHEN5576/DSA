package Hashmap.HashmapQuestions;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
        int[] nums = {2,7,11,15};
        int target =9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target-nums[i];
            if(map.containsKey(compliment)){
                System.out.println(map.get(compliment)+" "+i);
                break;
            }
            map.put(nums[i], i);

        }

    }
}
