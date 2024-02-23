package Treads;

import java.util.Arrays;

public class TreadTester {
    public static void main(String[] args) {
        System.out.println("Main is started");
//        Thread tread1 = new Thread1("username : stephen");
//        tread1.setDaemon(true);
//        tread1.start();

//        Thread2 thread2 = new Thread2();
//        thread2.run();
//        Thread thread2 = new Thread(new Thread2(),"Ron");
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread()+ " "+ i);
            }
        });
        thread2.start();

        System.out.println("Main is ended");


    }
}
