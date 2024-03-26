package StringQuestions.easy;

public class CheckIndex {
    public static void main(String[] args) {
        String str = "Hello, World";
        int index = 8;

        char result = check(str, index);
        System.out.println(result);
    }
    public static char check(String str, int index){
        if(index >= 0 && index < str.length()){
            return str.charAt(index);
        }
        else{
            return '\0';
        }
    }
}
