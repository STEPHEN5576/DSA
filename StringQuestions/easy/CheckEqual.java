package StringQuestions.easy;

import java.util.Locale;

public class CheckEqual {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hEllo";
        boolean ans = checkequal(str1, str2);
        System.out.println(ans);

    }
    public static boolean checkequal(String str1, String str2){

        // 1. by using just String method 1
//        String ans1 = str1.toLowerCase();
//        String ans2 = str2.toLowerCase();
//
//        if(ans1.equals(ans2)){
//            return true;
//        }else{
//            return false;
//        }

        // method 2 by using Character
        for (int  i= 0; i< str1.length(); i++){
            char ans1 = Character.toLowerCase(str1.charAt(i));
            char ans2 = Character.toLowerCase(str2.charAt(i));
            if(ans1 != ans2){
                return false;
            }
        }
        return true;
    }
}
