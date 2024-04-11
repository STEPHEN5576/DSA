package WhileLoop.easy;

public class reversethenum {
    public static void main(String[] args) {
        int num = 4325;
        int reversed = 0;
        while(num > 0){
            int number = num % 10;
            reversed = reversed *10 + number;
            num /= 10;
        }
        System.out.println(reversed);

    }
}
