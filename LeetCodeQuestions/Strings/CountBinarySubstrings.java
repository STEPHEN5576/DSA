package LeetCodeQuestions.Strings;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = countthesubstrings(s);
        System.out.println(ans);
    }
    public static int countthesubstrings(@NotNull String s){
        int count =0;
        int prevLength = 0;
        int currLength = 1;
        for(int i =1; i< s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currLength++;
            }else{
                count += Math.min(prevLength, currLength);
                prevLength = currLength;
                currLength = 1;
            }

        }
        count += Math.min(prevLength, currLength);
        return count++;
    }


}
