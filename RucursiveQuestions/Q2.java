package RucursiveQuestions;

// print natural number of?

public class Q2 {
    public static void main(String[] args) {
        int n = 5;
        int ans = print(n);
        System.out.println(ans);
    }
    public static int print(int n ){
        if(n == 1){
            return 1;
        }
        return n + print(n -1);
    }
}
