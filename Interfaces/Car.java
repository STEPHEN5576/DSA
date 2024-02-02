package Interfaces;

public class Car implements Engine, Brake {
    int a = 20;
    @Override
    public void brake() {
        System.out.println("I am brake like the normal car");
    }

    @Override
    public void start() {
        System.out.println("I Started the engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like the normal car");
    }

    @Override
    public void acceralte() {
        System.out.println("I accelerate like the normal car");
    }
}