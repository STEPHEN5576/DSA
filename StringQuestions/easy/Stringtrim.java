package StringQuestions.easy;

public class Stringtrim {
    public static void main(String[] args) {
        String trimthewhitespace = " hello, World! ";
        System.out.println(trimthewhitespace.length());
        String ans = trim(trimthewhitespace);
        System.out.println(ans.length());
    }
    public static String trim(String str){
        return str.trim();
    }
}
