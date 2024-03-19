package StringQuestions.easy;

public class SubstringCheck {
    public static void main(String[] args) {

        // 1. method 1
//        String str = "Hello World";
//        String str2 = "World";
//        System.out.println(str.contains(str2));

        // 2. method 2nd

        String str = "Hello, World";
        String str2 = "Hello";
       boolean checked = checkSubString(str, str2);
        System.out.println(checked);
    }
    public static boolean checkSubString(String str, String subString){
        if(str == null || subString == null){
            return false;
        }
        int strLength = str.length();
        int subLength = subString.length();

        for (int i = 0; i <= strLength - subLength; i++) {
            boolean found = true;
            for (int j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != subString.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;

    }
}
