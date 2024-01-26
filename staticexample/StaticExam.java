package staticexample;

public class StaticExam {
    static int a = 10;
    static int b;
    // will only run once, when the first object is create 1.e
    // when the class loaded only for first time
    static{
        System.out.println("I am static bloack");
        b= a*5;
    }

    public static void main(String[] args){
        StaticExam obj = new StaticExam();
        System.out.println(StaticExam.a + " "+ StaticExam.b);

        StaticExam.b += 3;
        System.out.println(StaticExam.a + " "+ StaticExam.b);

        StaticExam obj1 = new StaticExam();

        System.out.println(StaticExam.a + " "+ StaticExam.b);
    }
}
