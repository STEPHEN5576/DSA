package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car1 = new Car();
//        car1.start();
//        car1.stop();
//        car1.acceralte();
////        int b =car1.a;
////        System.out.println(b);
//        Media car2 = new CDplayer();
//        car2.start();
//        car2.stop();
//        Engine car3 = new PowerEngine();
//        car3.start();
//        Engine car4 = new ElectricEngine();
//        car4.start();
//        Mycar car5 = new Mycar(car4);
//        car5.start();

        Mycar vehile = new Mycar();
        vehile.start();
        vehile.startMusic();
        vehile.upgardeEngine();
        vehile.start();




    }
}
