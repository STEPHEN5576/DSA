package Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("started the electric motor");
    }

    @Override
    public void stop() {
        System.out.println("stoped electric motor");
    }

    @Override
    public void acceralte() {
        System.out.println("accerate the electric motor");
    }
}
