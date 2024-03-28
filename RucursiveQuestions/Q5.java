package RucursiveQuestions;

public class Q5 {
    public static void main(String[] args) {
        int a  = 16;
        int b = 3;
        boolean find  = check(a, b);
        System.out.println(find);
    }
    public static boolean check(int a, int b){
        if(a == 20 || b == 20){
            return true;
        }
        else if(a + b == 20){
            return true;
        }
        else{
            return false;
        }
    }
}
