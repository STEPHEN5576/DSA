package RucursiveQuestions;

// factorial
public class Q3 {
    public static void main(String[] args) {
        int n = 4;
        int result =print(n);
        System.out.println(result);
    }
    public static int print(int n){
        if(n == 1){
            return 1;
        }
        return n * print(n-1);
    }
}
