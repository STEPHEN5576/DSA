package Interfaces;

public class Mycar {
    private Engine engine;
    private Brake brake;
    private Media player = new CDplayer();
    public Mycar(){
       engine = new PowerEngine();
    }
    public Mycar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acceralte(){
        engine.acceralte();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgardeEngine(){
        this.engine = new ElectricEngine();
    }
    public void brake(){
        brake.brake();
    }


}
