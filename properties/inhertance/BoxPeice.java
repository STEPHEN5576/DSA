package properties.inhertance;

public class BoxPeice extends Boxweight{
    int price;
    BoxPeice(double l, double h, double w, double wieght, int price){
        super(l,h,w,wieght);
        this.price = price;
    }
    BoxPeice(){
        super();
        this.price=-1;
    }
    BoxPeice(BoxPeice old){
        super(old);
        this.price = old.price+5;

    }

}