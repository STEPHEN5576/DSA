package StringQuestions;

public class CheckString {
    public static void main(String[] args) {
        String str = "";
        String str1 = "HELLO WORLD";
        String str2 = null;

        Boolean checked = checkString(str);
        System.out.println(checked);
    }
    public static boolean checkString(String str){
        return str == null || str.isEmpty();
    }

}
