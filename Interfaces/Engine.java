package Interfaces;

public interface Engine {
    // i dont need to metion static and final
    // beacuse in behind the scences it itself is
    // static and final
    // since you cannot modify this variable;
    static final int PRICE = 750000;
    void start();
    void stop();
    void acceralte();
}
