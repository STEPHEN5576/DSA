package RucursiveQuestions;

public class Q4 {
    public static void main(String[] args) {
        String str = "stephen";
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i % 2 == 0){
                str = str.toUpperCase();
                str1.append(str.charAt(i));
            }
            else{
                str = str.toLowerCase();
                str1.append(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
}
