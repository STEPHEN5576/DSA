package properties.inhertance;

public class Boxweight extends Box{
    double wieght;
    Boxweight(){
        this.wieght= -1;
    }
    public Boxweight(double l, double h, double w, double wieght){
        super(l, h, w); // its saying call the parent class constructor
        // used to initialise values present in class
        // why should we write in first because this super class
        // keyword desn't know what the child contains it deosnt care the class so it
        // initailsizes first

        this.wieght = wieght;

    }
    Boxweight(Boxweight other){
        super(other);
        this.wieght= other.wieght;

    }
}
