package properties.inhertance;

public class Boxweight extends Box{
    double wieght;
    Boxweight(){
        this.wieght= -1;
    }
    public Boxweight(double l, double h, double w, double wieght){
        super(l, h, w); // its saying call the parent class constructor
        // used to initialise values present in class


        this.wieght = wieght;
    }
}
