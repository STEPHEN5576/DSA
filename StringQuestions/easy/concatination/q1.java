package StringQuestions.easy.concatination;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String result = str.concat(str1);
        System.out.println(result);
        int count  =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.length() != str1.length()){
                System.out.println("the string are not the same");
                break;
            }
            char s = str.toLowerCase().charAt(i);
            char d = str1.toLowerCase().charAt(i);
            if(s == d){
                count++;
            }
        }
        if(count == str.length()){
            System.out.println("The String are the same");
        }

        // isEmtpy
        if(str.length() == 0 || str.charAt(0) == ' '){
            System.out.println("No Strings available");
        }
    }
}
