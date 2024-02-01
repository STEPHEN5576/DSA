package properties.inhertance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h = -1;
        this.l= -1;
        this.w= -1;
    }

    // will not overiding
    static void greeting(){
        System.out.println("Hi I am a box");
    }

    // cube
    Box(double side){
//        super(); object class
        this.w = side;
        this.l = side;
        this.h = side;
        greeting();

    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h= h;
        greeting();
    }

    Box(Box old){
        this.h= old.h;
        this.l= old.l;
        this.w= old.w;
    }

    public void displayinfo(){
        System.out.println("Scanning the box");
    }

}
