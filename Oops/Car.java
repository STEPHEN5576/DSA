package Oops;
import static Oops.message.message1;
public class Car {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        Integer num = 45;

//        num.


        // it will not pass because only value is
        // passed not the reference variable
        swap(a, b);

        System.out.println(a + " "+ b);
        // Integer

        Integer c = 10;
        Integer d = 20;
        swap1(c, d);

        System.out.println(c+ " "+ d);

        final B child = new B("ron");

        // you can do this because it is an object not a primitive data type
        child.name = "stephen";
        System.out.println(child.name);

        // but you cant do this when a non primitive
        // is final you cannot resign it

//        child = new A("ron");
//        System.out.println(child.name);



//        B obj ;

//        for(int i =0; i< 1000000000; i++){
//            obj = new B("Random names");
//        }


        message1();



    }



    static void swap(int a , int b){
        Integer temp = a;
        a = b;
        b = temp;

        System.out.println(a +" " +b);
    }

    static void swap1 (Integer c , Integer d){
        int temp = c;
        c= d;
        d= temp;

    }

}
class B{
    final int num = 10;
    String name;

    public B(String name){
//        System.out.println("object created");
        this.name = name;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is detroyed");
    }
}
