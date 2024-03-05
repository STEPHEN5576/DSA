package LeetCodeQuestions.Bits;

import org.jetbrains.annotations.NotNull;

public class Singleordouble {
    public static void main(String[] args) {
        int[] bits1 = {1,0,0};
        int[] bits2 = {1,1,1,0};

        boolean result = isOneBitCharacter(bits1);
       boolean result1 = isOneBitCharacter(bits2);
        System.out.println(result);
        System.out.println(result1);
    }
    public static  boolean isOneBitCharacter(int @NotNull [] bits){
        int idx = 0;
        while(idx < bits.length-1){
            if(bits[idx] != 0){
                idx++;
            }
            idx++;
        }
        return idx == bits.length -1;
    }

}
