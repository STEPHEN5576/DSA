package Interfaces.extendsdemo;

import org.w3c.dom.ls.LSOutput;

public class Main implements A, B{
//    @Override
//    public void fun() {
//
//    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        System.out.println();
        A.climate();
    }
}
