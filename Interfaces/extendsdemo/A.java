package Interfaces.extendsdemo;

public interface A {
    default void fun(){
        System.out.println("Hi i am A");
    }
    static void climate(){
        System.out.println("its sunny");
    }

}
