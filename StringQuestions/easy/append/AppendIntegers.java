package StringQuestions.easy.append;

import static java.lang.Integer.parseInt;

public class AppendIntegers {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append(123);
        System.out.println(str);
        int ans = 20 + parseInt(String.valueOf(str));
        System.out.println((double)ans);
    }
}
