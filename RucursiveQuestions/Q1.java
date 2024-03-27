package RucursiveQuestions;
// print n numbers
public class Q1 {
    public static void main(String[] args) {
        int n = 4;
        print(n);

    }
    public static void print(int n){
        if(n > 0){
            System.out.println(n);
            print(n-1);
        }
    }
}
