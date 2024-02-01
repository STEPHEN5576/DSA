package properties.inhertance;

public class BoxPeice extends Boxweight{
    int price;
    BoxPeice(double l, double h, double w, double wieght, int price){
        super(l,h,w,wieght);
        this.price = price;
    }

    static void greeting(){
        System.out.println("Hi I am a box weight");
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