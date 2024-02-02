package Interfaces;

public class PowerEngine implements Engine, Brake{
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acceralte() {
        System.out.println("Power engine acceralte");
    }

    @Override
    public void brake() {
        System.out.println("Brake is applied");
    }
}
